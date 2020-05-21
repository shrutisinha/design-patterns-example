package exmple.designpatterns.structural.controller;

import exmple.designpatterns.structural.bridge.*;
import exmple.designpatterns.structural.decorator.BubbleLights;
import exmple.designpatterns.structural.decorator.ChristmasTree;
import exmple.designpatterns.structural.decorator.ChristmasTreeImpl;
import exmple.designpatterns.structural.decorator.Garland;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bridge")
public class BridgeController {
    @GetMapping("/type1")
    public String getRedSquare() {
        Shape square = new Square(new Red());
        return square.draw();
    }

    @GetMapping("/type2")
    public String getBlueTriangle() {
        Shape triangle = new Triangle(new Blue());
        return triangle.draw();
    }
}