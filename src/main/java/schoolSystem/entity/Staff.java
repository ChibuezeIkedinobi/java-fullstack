package schoolSystem.entity;

public abstract class Staff {
    private String name;
    private String role;
    private double salary;

    public Staff(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }
}
