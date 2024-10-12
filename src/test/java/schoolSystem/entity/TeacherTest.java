package schoolSystem.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    private List<Teacher> teacherList;

    @BeforeEach
    void setup() throws IOException {
        Teacher teacher = new Teacher();
        teacherList = teacher.readFile();
    }

    @Test
    void testReadFile_HappyPath() {
        assertEquals(2, teacherList.size());
        assertEquals("Mr Newton", teacherList.get(1).getName());
        assertEquals("Tutor 2", teacherList.get(1).getRole());
        assertEquals(4500000d, teacherList.get(0).getSalary());
    }

}