import java.util.Arrays;

public class Operation {
    public static void main(String[] args) {
        
                    // 🔷 Arrays

        // ✅ Declaration & Initialization
        // int[] arr = new int[5];
        int arr[] = {1,2,3,4,5};

        // ✅ Accessing Elements
        System.out.println(arr[2]);
        // System.out.println(arr[5]);

        // ✅ Updating Elements
        arr[2] = 10;
        System.out.println(arr[2]);

        // ✅ Traversing the Array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        } System.out.println();

        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();

        // ✅ Sorting & Searching
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();

        // ✅ Copying Arrays
        int[] newArr = Arrays.copyOf(arr, arr.length);
        for(int i : newArr) {
            System.out.print(i+" ");
        } System.out.println();


                    // 🔷 Strings
        
        // ✅ Declaration & Initialization
        String str = "Rohan";

        // ✅ Basic Operations - charAt(), length(), substring(), concatination
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.substring(1, 4));
        System.out.println(str.substring(3));
        System.out.println(str+" Kumar");
        System.out.println(str.concat(" Kumar"));

        // ✅ Comparisons
        System.out.println(str.compareTo("Rohan"));

        // ✅ Convert to char array
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++) {
            System.out.print(ch[i]+" ");
        } System.out.println();

        // ✅ StringBuilder (for efficient modifications)
        StringBuilder sb = new StringBuilder("Rohan");
        sb.append(" Kumar");
        System.out.println(sb);

        // ✅ StringBuilder to String
        System.out.println(sb.toString());

        
        // 🌟 Sliding Window Technique - Find maximum sum of any subarray of size 3.
        int[] arr2 = {7,9,2,3,5,11,10,0,1};
        int start=0, end=2;
        int maxSum = 18;
        int sum = maxSum;
        while(end != arr2.length-1) {
            start++; end++;
            sum = arr2[end]+sum-arr2[start-1];
            maxSum = Math.max(maxSum, sum);
        } System.out.println(maxSum);
        

        // 🌟 Prefix Sum
        int[] arr3 = {20,21,31,26,24,29};
        System.out.println(prefixSum(arr3,2));

        // 🌟 Two-pointer Technique
        int[] arr4 = {20,21,24,26,29,31};
        twoPointer(arr4,46);
    }

    private static void twoPointer(int[] arr3, int sum) {
        int start=0, end=arr3.length-1;
        while(start < end) {
            if(arr3[start]+arr3[end] == sum) {
                System.out.println("Both indicies are "+start+", "+end);
                break;
            } else if(arr3[start]+arr3[end] < sum) {
                start++;
            } else {
                end--;
            }
        }
    }

    private static int prefixSum(int[] arr3, int last) {
        int sum = 0 ;
        for(int i=0; i<last; i++) {
            sum += arr3[i];
        } return sum;
    }
}