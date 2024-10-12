package schoolSystem.entity;

import schoolSystem.interfaces.PrincipalTasks;


public class Principal extends Staff implements PrincipalTasks {

    private final ClassRoom classRoom;

    public Principal(String name, String role, double salary, ClassRoom classRoom) {
        super(name, role, salary);
        this.classRoom = classRoom;
    }

    @Override
    public String expel(Student student) {
        if (classRoom.getStudentList().contains(student)) {
            classRoom.getStudentList().remove(student);
            return student.getName() + " has been expelled.⚔️";
        }
        return student.getName() + " has already been expelled.⚔️";
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
