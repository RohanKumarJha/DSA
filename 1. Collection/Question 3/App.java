import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,4,1,1,5,5,2,5,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], (map.get(arr[i]))+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(var i : map.entrySet()) {
            System.out.println(i);
        }
    }
}
