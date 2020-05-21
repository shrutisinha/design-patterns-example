package exmple.designpatterns.creational.prototype;


import org.springframework.stereotype.Component;

@Component
public class SpringPrototype {
    public Developer hDeveloper = new Developer("Heril Muratovic", Role.DEVELOPER);
    public ProjectManager hManager = new ProjectManager("Heril Muratovic", Role.PROJECT_MANAGER);
}
