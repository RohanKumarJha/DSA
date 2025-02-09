package Sorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,3,4,5,2,1};
        for(int i=0; i<arr.length; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min] < arr[j]) min=j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        } System.out.println(arr);
    }
}
