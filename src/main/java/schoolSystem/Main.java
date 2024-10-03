package schoolSystem;

import schoolSystem.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Segun", "Teacher", 2150000);
        teacher.teachCourse("Core Java");

        NonAcademic nonAcademic1 = new NonAcademic("Jumoke", "Cleaner", 50000);
        NonAcademic nonAcademic2 = new NonAcademic("Bruno", "Security Man", 65000);
        NonAcademic nonAcademic3 = new NonAcademic("Grace", "Cook", 85000);

        System.out.println();
        System.out.println("_________Courses__________________");

        Student student1 = new Student("Stephanie", 25);
        Student student2 = new Student("Kelvin", 20);

        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();

        Course coreJava = new Course("Core Java");
        Course react = new Course("ReactJs");

        ClassRoom classRoom = new ClassRoom(studentList, courseList);
        classRoom.addStudent(student1);
        classRoom.addStudent(student2);
        classRoom.addCourse(coreJava);
        classRoom.addCourse(react);

        classRoom.displayCourses();

        System.out.println();
        System.out.println("_________Student Courses__________________");

        student1.enrollCourse(coreJava);
        student1.enrollCourse(react);
        student2.enrollCourse(react);

        System.out.println();
        System.out.println("_________Admissions__________________");

        Principal principal = new Principal("Ikedinobi","Principal",  5400000, classRoom);

        Applicant applicant1 = new Applicant("John", 24);
        Applicant applicant2 = new Applicant("James", 12);

        principal.admit(applicant1);
        principal.admit(applicant2);

        System.out.println();
        System.out.println("_________Expelling Students__________________");

        System.out.println("💥Student List after expelling Kelvin💥");
        classRoom.displayStudents();
        System.out.println("_______________________________________________");

        principal.expel(student2);
        principal.expel(student2);
        System.out.println("_______________________________________________");

        System.out.println("💥Student List after expelling Kelvin💥");
        classRoom.displayStudents();

        System.out.println();
        System.out.println("_________Non Academic Staffs__________________");

        nonAcademic1.duty();
        nonAcademic2.duty();
        nonAcademic3.duty();

    }
}
