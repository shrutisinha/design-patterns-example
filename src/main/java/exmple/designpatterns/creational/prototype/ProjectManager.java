package exmple.designpatterns.creational.prototype;

import org.springframework.context.annotation.Description;

@Description(value = "Project Manager prototype.")
public class ProjectManager extends EmployeeAbstract {

    private String fullName;
    private Role role;

    public ProjectManager(String fullName, Role role)
    {
        this.fullName = fullName;
        this.role = role;
    }

    @Override
    public EmployeeAbstract cloneObject() {
        return new ProjectManager(fullName, role);
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
        return "ProjectManager{" +
                "fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}

