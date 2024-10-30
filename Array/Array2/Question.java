public class Question {
    public static int[] smallestAndLargest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(smallest > arr[i]) smallest=arr[i];
            if(largest < arr[i]) largest=arr[i];
        } return new int[]{smallest,largest};
    }
    // public static boolean isSorted(int[] arr) {
    //     boolean flag = true;
    //     for(int i=1; i<arr.length; i++) {
    //         if(arr[i]<arr[i-1]) {
    //             flag = false;
    //             break;
    //         }
    //     } return flag;
    // }
    // public static int noOfElmGreater(int[] arr,int elem) {
    //     int count = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         if(elem < arr[i]) count++;
    //     } return count;
    // }
    // public static int lastOccurence(int[] arr,int find) {
    //     int elem = -1;
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == find) elem=i;
    //     } return elem;
    // }
    // public static int noOfOccurence(int[] arr,int find) {
    //     int count = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == find) count++;
    //     } return count;
    // }
    public static void main(String[] args) {
        // Question1
        // int[] arr = {2,4,5,2,4,2,4,2,2,5,2};
        // int find = 5;
        // System.out.println("The number of occurence of "+find+" is "+noOfOccurence(arr,find));

        // Question2
        // int[] arr = {2,4,5,2,4,2,4,2,2,5,2};
        // int find = 2;
        // if(lastOccurence(arr,find) == -1) {
        //     System.out.println("Element doesn't exist");
        // } else System.out.println("The last occurence of "+find+" is "+lastOccurence(arr,find)+" position");

        // Question3
        // int[] arr = {2,4,5,2,4,2,4,2,2,5,2};
        // int elem = 4;
        // if(noOfElmGreater(arr,elem) == 0) {
        //     System.out.println("No elements is greater than "+elem);
        // } else {
        //     System.out.println("The number of elem which is stictly greater is "+noOfElmGreater(arr,elem));
        // }

        // Question4
        // int[] arr = {1,2,3,4,5,9,5,6,7,9,10};
        // if(isSorted(arr)) {
        //     System.out.println("Array is sorted");
        // } else {
        //     System.out.println("Array isn't sorted");
        // }

        // Question 5
        int[] arr = {23,34,12,18,29,45,36,29};
        int[] newArr = smallestAndLargest(arr);
        System.out.println("The smallest element is "+newArr[0]);
        System.out.println("The largest element is "+newArr[1]);
    }
}