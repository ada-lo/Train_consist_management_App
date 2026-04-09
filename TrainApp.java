import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<GoodsBogie> consist = new ArrayList<>();
        consist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        consist.add(new GoodsBogie("Box", "Coal"));
        consist.add(new GoodsBogie("Open", "Grain"));
        
        // Safety Rule: Cylindrical bogies must carry Petroleum
        boolean isSafe = consist.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
                
        System.out.println("Is train safety compliant? " + isSafe);
        
        // Let's test with a violation
        consist.add(new GoodsBogie("Cylindrical", "Coal"));
        boolean isSafeWeViolation = consist.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
                
        System.out.println("Is train safety compliant after adding Coal to Cylindrical? " + isSafeWeViolation);
    }
}
