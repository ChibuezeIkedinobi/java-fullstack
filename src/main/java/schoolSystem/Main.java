package schoolSystem;

import schoolSystem.entity.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Teacher teacher = new Teacher();
        List<Teacher> teacherList = teacher.readFile();

        Teacher teacher1 = teacherList.get(0);
        Teacher teacher2 = teacherList.get(1);

        NonAcademic nonAcademic1 = new NonAcademic("Jumoke", "Cleaner", 50000);
        NonAcademic nonAcademic2 = new NonAcademic("Bruno", "Security Man", 65000);
        NonAcademic nonAcademic3 = new NonAcademic("Grace", "Cook", 85000);

        System.out.println();
        System.out.println("_________Courses__________________");


        Student student = new Student();
        List<Student> studentList = student.readFile();

        List<Course> courseList = new ArrayList<>();

        Course coreJava = new Course("Core Java");
        Course agile = new Course("Agile Methodologies");

        ClassRoom classRoom = new ClassRoom(studentList, courseList);
        classRoom.addCourse(coreJava);
        classRoom.addCourse(agile);

        System.out.println(classRoom.displayCourses());
        System.out.println();
        teacher1.teachCourse(coreJava.getName());
        teacher2.teachCourse(agile.getName());

        System.out.println();
        System.out.println("_________Student Courses__________________");

        Student student1 = studentList.get(0);
        Student student2 = studentList.get(1);

        System.out.println(student1.enrollCourse(coreJava));
        System.out.println(student1.enrollCourse(agile));
        System.out.println(student2.enrollCourse(agile));

        System.out.println();
        System.out.println("_________Admissions__________________");

        Principal principal = new Principal("Ikedinobi","Principal",  5400000, classRoom);

        Applicant applicant1 = new Applicant("John", 24);
        Applicant applicant2 = new Applicant("James", 12);

        principal.admit(applicant1);
        principal.admit(applicant2);

        System.out.println();
        System.out.println("_________Expelling Students__________________");

        System.out.println("💥Student List before expelling Kelvin💥");
        System.out.println(classRoom.displayStudents());
        System.out.println("_______________________________________________");

        System.out.println(principal.expel(student2));
        System.out.println(principal.expel(student2));
        System.out.println(principal.expel(student2));
        System.out.println("_______________________________________________");

        System.out.println("💥Student List after expelling Kelvin💥");
        System.out.println(classRoom.displayStudents());

        System.out.println();
        System.out.println("_________Non Academic Staffs__________________");

        System.out.println(nonAcademic1.duty());
        System.out.println(nonAcademic2.duty());
        System.out.println(nonAcademic3.duty());

    }
}
