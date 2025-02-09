package Sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,3,4,5,2,1};
        int size = arr.length;
        for(int i=0; i<size-i; i++) {
            for(int j=0; j<size-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  =temp;
                }
            }
        }
        System.out.println(arr);
    }
}
