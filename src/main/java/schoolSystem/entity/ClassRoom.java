package schoolSystem.entity;

import java.util.List;

public class ClassRoom {

    private final List<Student> studentList;
    private final List<Course> courseList;

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

    public String displayCourses() {
        StringBuilder courseList1 = new StringBuilder();
        for (Course course : getCourseList()) {
            courseList1.append(course.getName()).append("\n");
        }
        return courseList1.toString();
    }

    public String displayStudents() {
        StringBuilder studentList1 = new StringBuilder();
        for (Student student : getStudentList()) {
            studentList1.append(student.getName()).append("\n");
        }
        return studentList1.toString();
    }
}
