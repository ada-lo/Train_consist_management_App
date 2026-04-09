import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> consist = new ArrayList<>();
        consist.add(new Bogie("Sleeper", 72));
        consist.add(new Bogie("AC Chair", 56));
        consist.add(new Bogie("First Class", 24));
        
        List<Bogie> filteredList = consist.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
                
        System.out.println("Filtered Bogies (Capacity > 60): " + filteredList);
    }
}
