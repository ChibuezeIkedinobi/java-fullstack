package classActivity1;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Segun", 66);
        Student student = new Student("Ikedi", 16);

        teacher.display();
        student.display();

    }
}
