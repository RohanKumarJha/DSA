import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int minElmIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minElmIdx] > arr[j]) minElmIdx=j;
            } 
            Bubblesort.swap(arr,i,minElmIdx); // Use swap method from bubbleSort class
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
