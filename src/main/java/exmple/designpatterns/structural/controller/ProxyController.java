package exmple.designpatterns.structural.controller;

import exmple.designpatterns.creational.builder.Employee;
import exmple.designpatterns.creational.builder.EmployeeBuilder;
import exmple.designpatterns.creational.prototype.EmployeeAbstract;
import exmple.designpatterns.structural.proxy.ExpensiveObject;
import exmple.designpatterns.structural.proxy.ExpensiveObjectProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/proxy")
public class ProxyController {
    @GetMapping("")
    public Map<String, Integer> getExpensiveObject() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
        return  object.count();
    }
}
