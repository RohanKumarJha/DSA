public class Question {
    public static void frequencyArray(int[] arr,int elem) {
        int[] freqArr = new int[100];
        for(int i=0; i<freqArr.length; i++) {
            freqArr[i] = 0;
        }
        for(int i=0; i<arr.length; i++) {
            freqArr[arr[i]]++;
        }
        if(freqArr[elem] > 0) System.out.println("Element is present");
        else System.out.println("Element not present");
    }
    // public static void kStepsWithoutUsingSpace(int[] arr,int k) {
    //     int n = arr.length;
    //     // For first half rotate
    //     for(int i=0; i<(n-k)/2; i++) {
    //         int temp = arr[i];
    //         arr[i] = arr[n-k-i-1];
    //         arr[n-k-i-1] = temp;
    //     }
    //     // For second half rotate
    //     for(int i=0; i<k/2; i++) {
    //         int temp = arr[n-k+i];
    //         arr[n-k+i] = arr[n-i-1];
    //         arr[n-i-1] = temp;
    //     }
    //     // Full rotate
    //     for(int i=0; i<n/2; i++) {
    //         int temp = arr[i];
    //         arr[i] = arr[n-i-1];
    //         arr[n-i-1] = temp;
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void kStepsUsingSpace(int[] arr,int k) {
    //     int n = arr.length;
    //     int[] newArr = new int[n];
    //     for(int i=0; i<n; i++) {
    //         if((i+k)<n) newArr[i+k] = arr[i];
    //         else newArr[(i+k)%n] = arr[i];
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(newArr[i]+" ");
    //     }
    // }
    // public static void rotate(int[] arr) {
    //     int n = arr.length;
    //     for(int i=0; i<n/2; i++) {
    //         int temp = arr[i];
    //         arr[i] = arr[n-i-1];
    //         arr[n-i-1] = temp;
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void swapWithoutTemp(int a,int b) {
    //     a = a+b;
    //     b = a-b;
    //     a = a-b;
    //     System.out.println("The value of a after swap is "+a);
    //     System.out.println("The value of b after swap is "+b);
    // }
    // public static void swapTemp(int a,int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("The value of a after swap is "+a);
    //     System.out.println("The value of b after swap is "+b);
    // }
    public static void main(String[] args) {
        // Question1
        // int a=10, b=20;
        // swapTemp(a,b);

        // Question2
        // int a=10, b=20;
        // swapWithoutTemp(a,b);

        // Question3
        // int[] arr = {23,34,12,16,57,24,78,47,59};
        // rotate(arr);

        // Question4
        // int[] arr = {23,34,12,16,57,24,78,47,59};
        // int n = arr.length;
        // int k = 3;
        // kStepsUsingSpace(arr,k%n);

        // *****Question5*****
        // int[] arr = {1,2,3,4,5,6};
        // int n = arr.length;
        // int k = 2;
        // kStepsWithoutUsingSpace(arr,k%n);

        // Question6
        int[] arr = {23,34,12,16,57,24,78,47,59};
        int elem = 23;
        frequencyArray(arr,elem);
    }
}