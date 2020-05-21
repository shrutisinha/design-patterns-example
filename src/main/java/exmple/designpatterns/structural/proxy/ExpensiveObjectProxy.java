package exmple.designpatterns.structural.proxy;

import java.util.Map;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }

    @Override
    public Map<String, Integer> count() {
        if (object != null) {
            return object.count();
        }
        return null;
    }

}