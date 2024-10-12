package schoolSystem.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StudentTest {
    private List<Student> students;

    @BeforeEach
    void setup() throws IOException {
        Student student = new Student();
        students = student.readFile();
    }

    @Test
    void testReadFile_HappyPath() {
        assertEquals(2, students.size());
        assertEquals("Stephanie Okeke", students.get(0).getName());
        assertEquals(27, students.get(1).getAge());
    }

    @Test
    void enrollCourse_HappyPath() {
        Course coreJava = new Course("Core Java");

        assertEquals("Stephanie Okeke is taking Core Java", students.get(0).enrollCourse(coreJava));
    }

}