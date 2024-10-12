package schoolSystem.entity;

public class NonAcademic extends Staff {
    public NonAcademic(String name, String role, double salary) {
        super(name, role, salary);
    }

    public String duty() {
        return getName() + " is a "+ getRole();
    }


}
