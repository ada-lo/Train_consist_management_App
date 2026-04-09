import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> consist = new ArrayList<>();
        consist.add(new Bogie("Sleeper", "S1"));
        consist.add(new Bogie("Sleeper", "S2"));
        consist.add(new Bogie("AC Chair", "AC1"));
        consist.add(new Bogie("First Class", "FC1"));
        
        Map<String, List<Bogie>> groupedBogies = consist.stream()
                .collect(Collectors.groupingBy(b -> b.type));
                
        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}
