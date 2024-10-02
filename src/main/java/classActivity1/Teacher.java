package classActivity1;

public class Teacher extends Person{
    public Teacher(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    void display() {
        System.out.println("Teacher Details: "+ getFullName()+" "+ getAge());
    }
}
