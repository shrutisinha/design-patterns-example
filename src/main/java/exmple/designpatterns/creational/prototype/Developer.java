package exmple.designpatterns.creational.prototype;


import org.springframework.context.annotation.Description;

@Description(value = "Prototype of Employee")
public class Developer extends EmployeeAbstract {

    private String fullName;
    private Role role;

    public Developer(String fullName, Role role)
    {
        this.fullName = fullName;
        this.role = role;
    }

    @Override
    public EmployeeAbstract cloneObject() {
        return new Developer(fullName, role);
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "Developer{" +
                "fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}
