// import java.util.Arrays;

public class Question {
    public static int firstRepeat(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) return arr[i];
            }
        } return -1;
    }
    // public static int secondLargest(int[] arr) {
    //     int lar = -1;
    //     int sLar = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i]>lar) {
    //             sLar = lar;
    //             lar = arr[i];
    //         } else if(arr[i]<lar && arr[i]>sLar) {
    //             sLar = arr[i];
    //         }
    //     } return sLar;
    // }
    // public static int uniqueElm(int[] arr) {
    //     Arrays.sort(arr);
    //     for(int i=0; i<arr.length; i+=2) {
    //         if(i==arr.length-1 || arr[i]!=arr[i+1]) return arr[i];
    //     } return -1;
    // }
    // public static int tripletSum(int[] arr,int target) {
    //     int count = 0;
    //     for(int i=0; i<arr.length-2; i++) {
    //         for(int j=i+1; j<arr.length-1; j++) {
    //             for(int k=j+1; k<arr.length; k++) {
    //                 if((arr[i]+arr[j]+arr[k])==target) count++;
    //             }
    //         }
    //     } return count;
    // }
    // public static int pairSum(int[] arr,int target) {
    //     int count = 0;
    //     for(int i=0; i<arr.length-1; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if((arr[i]+arr[j])==target) count++;
    //         }
    //     } return count;
    // }
    public static void main(String[] args) {
        // Question1
        // int[] arr = {4,6,3,5,8,2};
        // int target = 7;
        // if(pairSum(arr,target) == 0) {
        //     System.out.println("No Pair");
        // } else {
        //     System.out.println("Total Pairs "+pairSum(arr,target));
        // }

        // Question2
        // int[] arr = {2,1,5,2,4,2,4,5,1};
        // int target = 8;
        // if(tripletSum(arr,target) == 0) {
        //     System.out.println("No Pair");
        // } else {
        //     System.out.println("Total Pairs "+tripletSum(arr, target));
        // }

        // Question3
        // int[] arr = {2,2,3,3,4,4,5,5,6};
        // System.out.println(uniqueElm(arr));

        // Question4
        // int[] arr = {4,6,8,6,8,2};
        // System.out.println("The second largest element is "+secondLargest(arr));

        // Question5
        int[] arr = {1,5,3,4,6,3,4};
        System.out.println("The first element which repeat is "+firstRepeat(arr));
    }
}