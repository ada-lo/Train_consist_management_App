import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<Bogie> consist = new ArrayList<>();
        consist.add(new Bogie("Sleeper", 72));
        consist.add(new Bogie("Sleeper", 72));
        consist.add(new Bogie("AC Chair", 56));
        consist.add(new Bogie("First Class", 24));
        
        int totalSeats = consist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
                
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}
