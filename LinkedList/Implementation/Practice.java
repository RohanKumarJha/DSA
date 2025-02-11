import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {10,20,14,37,57,100};
        LinkedList ll = new LinkedList();

        // Create a linkedList
        for(int i : arr) {
            ll.add(i);
        }

        // Display the linkedlist
        ll.display();
        System.out.println();

        // Display the length of linkedlist
        System.out.println("The length of linkedlist is "+ll.length);

        // Get element from linkedlist
        System.out.println("Enter the index number in which element you want to find");
        int idx = Integer.parseInt(br.readLine());
        ll.getElm(idx);
    }
}