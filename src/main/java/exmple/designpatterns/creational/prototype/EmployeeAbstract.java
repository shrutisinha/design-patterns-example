package exmple.designpatterns.creational.prototype;


import org.springframework.context.annotation.Description;

@Description(value = "Abstract Employee...")
public abstract class EmployeeAbstract {

    private String fullName;
    private Role role;

    public abstract EmployeeAbstract cloneObject();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}