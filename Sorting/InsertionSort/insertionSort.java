package Sorting.InsertionSort;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,3,4,5,2,1};
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j>=0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else break;
            }
        } System.out.println(arr);
    }
}
