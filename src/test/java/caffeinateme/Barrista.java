package caffeinateme;

import java.util.ArrayList;
import java.util.List;

public class Barrista {

    public List<String> getPendingOrder() {
        List<String> results = new ArrayList<>();
        results.add("large cappuccino");
        return results;
    }

    public List<String> getUrgentOrders() {
        List<String> results = new ArrayList<>();
        results.add("large cappuccino");
        return results;
    }
}
