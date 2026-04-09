import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";
        
        Pattern trainIdPattern = Pattern.compile("TRN-\\\\d{4}");
        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        System.out.println("Train ID '" + trainId + "' is valid: " + trainIdMatcher.matches());
        
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);
        System.out.println("Cargo Code '" + cargoCode + "' is valid: " + cargoCodeMatcher.matches());
        
        // Invalid examples
        System.out.println("Train ID 'TRAIN12' is valid: " + trainIdPattern.matcher("TRAIN12").matches());
        System.out.println("Cargo Code 'PET-ab' is valid: " + cargoCodePattern.matcher("PET-ab").matches());
    }
}
