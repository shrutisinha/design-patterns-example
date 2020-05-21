package exmple.designpatterns.structural.controller;

import exmple.designpatterns.structural.adapter.BugattiVeyron;
import exmple.designpatterns.structural.adapter.Movable;
import exmple.designpatterns.structural.adapter.MovableAdapter;
import exmple.designpatterns.structural.adapter.MovableAdapterImpl;
import exmple.designpatterns.structural.decorator.ChristmasTree;
import exmple.designpatterns.structural.decorator.ChristmasTreeImpl;
import exmple.designpatterns.structural.decorator.Garland;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/adapter")
public class AdapterController {
    @GetMapping("")
    public Map<String, Double> getBugattiVeyronSpeed() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        Map<String, Double> res = new HashMap<>();
        res.put("Speed in MPH", bugattiVeyron.getSpeed());
        res.put("Speed in KMPH", bugattiVeyronAdapter.getSpeed());
        return res;
    }
}
