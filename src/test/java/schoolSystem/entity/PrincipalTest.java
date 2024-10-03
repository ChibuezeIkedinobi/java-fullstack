package schoolSystem.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    List<Student> studentList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();
    ClassRoom classRoom = new ClassRoom(studentList, courseList);
    Principal principal = new Principal("Ikedinobi","Principal",  5400000, classRoom);


    @Test
    void admit() {
        Applicant applicant1 = new Applicant("John", 24);
        assertTrue(principal.admit(applicant1));
    }
}