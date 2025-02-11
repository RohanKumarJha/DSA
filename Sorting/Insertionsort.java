import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insertionsort {
    public static int[] sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    Bubblesort.swap(arr, j, j-1);
                } else break; 
            }
        } return arr;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array");
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Before sorting");
        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();

        arr = sort(arr);

        System.out.println("After sorting");
        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();

    }
}
