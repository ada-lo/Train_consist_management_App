import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        HashMap<String, Integer> capacities = new HashMap<>();
        
        capacities.put("Sleeper", 72);
        capacities.put("AC Chair", 56);
        capacities.put("First Class", 24);
        
        for (Map.Entry<String, Integer> entry : capacities.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + ", Capacity: " + entry.getValue());
        }
    }
}
