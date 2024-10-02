package schoolSystem.entity;

import java.util.List;

public class ClassRoom {

    private List<Student> studentList;
    private List<Course> courseList;

    public ClassRoom(List<Student> studentList, List<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void displayCourses() {
        for (Course course : getCourseList()) {
            System.out.println(course.getName());
        }
    }

    public void displayStudents() {
        for (Student student : getStudentList()) {
            System.out.println(student.getName());
        }
    }
}
