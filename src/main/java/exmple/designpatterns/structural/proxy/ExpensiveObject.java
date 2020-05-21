package exmple.designpatterns.structural.proxy;

import java.util.Map;

public interface ExpensiveObject {
    void process();
    Map<String, Integer> count();
}