package schoolSystem.entity;

import schoolSystem.interfaces.PrincipalTasks;


public class Principal extends Staff implements PrincipalTasks {

    private final ClassRoom classRoom;

    public Principal(String name, String role, double salary, ClassRoom classRoom) {
        super(name, role, salary);
        this.classRoom = classRoom;
    }

    @Override
    public void expel(Student student) {
        if (classRoom.getStudentList().contains(student)) {
            classRoom.getStudentList().remove(student);
            System.out.println(student.getName() + " has been expelled.⚔️");
        }
    }

    @Override
    public boolean admit(Applicant applicant) {
        if (applicant.getAge() > 15) {
            System.out.println("Congratulations, Applicant "+ applicant.getName()+ " admission is Successful🎉");
            return true;
        }
        System.out.println(applicant.getName() + " is underage. Not Admitted!!!");
        return false;
    }

}
