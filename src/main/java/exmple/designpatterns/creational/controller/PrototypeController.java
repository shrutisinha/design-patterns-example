package exmple.designpatterns.creational.controller;

import exmple.designpatterns.creational.prototype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/prototype")
public class PrototypeController {

    @Autowired
    SpringPrototype prototype;

    @PostMapping("/developer/{name}")
    public Map<String, EmployeeAbstract> createDeveloper(@PathVariable String name) {
        // create original instance of developer...
        Developer hDeveloper = prototype.hDeveloper;
        // create prototype of developer...
        Developer jDeveloper = (Developer) hDeveloper.cloneObject();
        jDeveloper.setFullName(name);

        Map<String, EmployeeAbstract> res= new HashMap<String, EmployeeAbstract>();
        res.put("old", hDeveloper);
        res.put("new", jDeveloper);

        return  res;
    }

    @PostMapping("/manager/{name}")
    public Map<String, EmployeeAbstract> createManager(@PathVariable String name) {
        // create original instance of developer...
        ProjectManager hManager = prototype.hManager;

        // create prototype of developer...
        ProjectManager jManager = (ProjectManager) hManager.cloneObject();
        jManager.setFullName(name);

        Map<String, EmployeeAbstract> res= new HashMap<String, EmployeeAbstract>();
        res.put("old", hManager);
        res.put("new", jManager);

        return  res;
    }
}
