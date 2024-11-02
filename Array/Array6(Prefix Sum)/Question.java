public class Question {
    public static boolean prefixSuffixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for(int i=0; i<n; i++) {
            if(i==0) prefix[i]=arr[i];
            else prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=n-1; i>=0; i--) {
            if(i==n-1) suffix[i]=arr[i];
            else suffix[i]=arr[i]+suffix[i+1];
        }
        for(int i=0; i<n-1; i++) {
            if(prefix[i] == suffix[i+1]) return true;
        } return false;
    }
    // public static void frequencyArray(int[] arr) {
    //     int n = arr.length;
    //     int[] freqArr = new int[n];
    //     for(int i=0; i<n; i++) {
    //         if(i==0) freqArr[i]=arr[i];
    //         else freqArr[i]=arr[i]+freqArr[i-1];
    //     }
    //     int l=3, r=6;
    //     for(int i=l-1; i<r; i++) {
    //         System.out.print(freqArr[i]+" ");
    //     }
    // }
    // public static void prefixSum(int[] arr) {
    //     int n = arr.length;
    //     for(int i=0; i<n; i++) {
    //         if(i==0) {
    //             arr[i] = arr[i];
    //         } else {
    //             arr[i] += arr[i-1];
    //         }
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        // Question1
        // int[] arr = {2,1,3,4,5};
        // prefixSum(arr);

        // Question2
        // int[] arr = {2,5,4,7,8,15,6,9};
        // frequencyArray(arr);

        // Question3
        int[] arr = {5,3,2,6,3,1};
        if(prefixSuffixSum(arr)) System.out.println("Two subarray having equal sum.");
        else System.out.println("Two subarray haven't equal sum.");
    }
}