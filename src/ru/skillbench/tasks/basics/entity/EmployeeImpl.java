package ru.skillbench.tasks.basics.entity;

public class EmployeeImpl implements Employee {

    private int salary;
    private String firstName;
    private String lastName;
    private Employee manager;

    public EmployeeImpl() {
        this.salary = 1000;
        this.firstName = null;
        this.lastName = null;
        this.manager = null;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void increaseSalary(int value) {
        this.salary += value;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = new String(firstName);
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = new String(lastName);
    }

    @Override
    public String getFullName() {
        String fullName = new String(this.firstName + " " + this.lastName);
        return fullName;
    }

    @Override
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String getManagerName() {
        String managerName = new String("No manager");
        if (this.manager != null)
            managerName = this.manager.getFullName();
        return managerName;
    }

    @Override
    public Employee getTopManager() {
        Employee topManager = this;
        if (this.manager != null)
            topManager = this.manager.getTopManager();
        return topManager;
    }
}
