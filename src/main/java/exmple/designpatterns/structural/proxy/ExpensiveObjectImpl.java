package exmple.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private String initial = "Loading initial configuration... ";
    private String processed = "Processing complete.";
    private Integer configCount = 0;
    private Integer processCount = 0;
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        processCount++;
    }

    private void heavyInitialConfiguration() {
        configCount++;
    }

    @Override
    public Map<String, Integer> count() {
        Map<String, Integer> res= new HashMap<String, Integer>();
        res.put("configCount", configCount);
        res.put("processCount", processCount);
        return res;
    }

}