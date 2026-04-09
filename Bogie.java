public class Bogie {
    String type;
    String id;
    
    public Bogie(String type, String id) {
        this.type = type;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return id;
    }
}
