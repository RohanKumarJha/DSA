import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubblesort {

    public static void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int[] sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            boolean flag = false;
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1])  {
                    flag = true;
                    swap(arr,j,j+1);
                }
            } if(!flag) return arr;
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

        // Before sorting
        System.out.println("Before sorting");
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        // After sorting
        arr = sort(arr);
        System.out.println("After sorting");
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}