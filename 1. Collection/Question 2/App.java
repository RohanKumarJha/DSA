import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Rohan", 26);
        map.put("Rohan", 25);
        // map.put("Rishabh", 21);
        for(var i : map.keySet()) {
            System.out.println(i);
        }
        for(var i : map.values()) {
            System.out.println(i);
        }
        for(var i : map.entrySet()) {
            System.out.println(i);
        }
    }
}