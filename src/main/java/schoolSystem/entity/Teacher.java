package schoolSystem.entity;

public class Teacher extends Staff{
    public Teacher(String name, String role, double salary) {
        super(name, role, salary);
    }
    public void teachCourse(String course) {
        System.out.println(getName() + " is teaching "+ course);
    }
}
