package exmple.designpatterns.structural.composite;

import java.util.List;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<String> printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
