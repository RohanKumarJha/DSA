public class Questions {
    public static int findElm(int[] arr,int find) {
        for(int i=0; i<arr.length; i++) {
            if(find == arr[i]) return i;
        } return -1;
    }
    // public static int maxVal(int[] arr) {
    //     int maxVal = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         maxVal = Math.max(maxVal, arr[i]);
    //     } return maxVal;
    // }
    // public static int sum(int[] arr) {
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         sum += arr[i];
    //     } return sum;
    // }
    public static void main(String[] args) {
        // Question1
        // int[] arr = {2,3,4};
        // System.out.println(sum(arr));

        // Question2
        // int[] arr = {3,7,19,2,57,23,67,12,24,35};
        // System.out.println("The maximum value of an array is "+maxVal(arr));

        // Question3
        int[] arr = {3,7,19,2,57,23,67,12,24,35};
        int find = 230;
        if(findElm(arr,find) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("The index of element is "+findElm(arr,find));
        }
    }
}