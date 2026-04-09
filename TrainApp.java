import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        ArrayList<String> consist = new ArrayList<>();
        
        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");
        
        System.out.println("Train consist after insertion: " + consist);
        
        consist.remove("AC Chair");
        System.out.println("Train consist after removal: " + consist);
        
        boolean hasSleeper = consist.contains("Sleeper");
        System.out.println("Does Train have Sleeper? " + hasSleeper);
        
        System.out.println("Final Train consist: " + consist);
    }
}
