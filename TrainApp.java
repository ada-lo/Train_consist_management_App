import java.util.HashSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        HashSet<String> consist = new HashSet<>();
        
        consist.add("BG101");
        consist.add("BG102");
        consist.add("BG101"); // Intentional duplicate
        
        System.out.println("Train consist IDs (Duplicates automatically removed): " + consist);
    }
}
