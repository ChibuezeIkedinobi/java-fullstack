package schoolSystem.entity;

public class NonAcademic extends Staff {
    public NonAcademic(String name, String role, double salary) {
        super(name, role, salary);
    }

    public void duty() {
        System.out.println(getName() + " is a "+ getRole());
    }


}
