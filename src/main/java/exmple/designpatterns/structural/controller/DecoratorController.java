package exmple.designpatterns.structural.controller;

import exmple.designpatterns.structural.decorator.BubbleLights;
import exmple.designpatterns.structural.decorator.ChristmasTree;
import exmple.designpatterns.structural.decorator.ChristmasTreeImpl;
import exmple.designpatterns.structural.decorator.Garland;
import exmple.designpatterns.structural.proxy.ExpensiveObject;
import exmple.designpatterns.structural.proxy.ExpensiveObjectProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorate")
public class DecoratorController {

    @GetMapping("/type1")
    public String getGarlandDecoratedTree() {
        ChristmasTree tree = new Garland(new ChristmasTreeImpl());
        return tree.decorate();
    }

    @GetMapping("/type2")
    public String getLightsGarlandsDecoratedTree() {
        ChristmasTree tree = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        return tree.decorate();
    }
}