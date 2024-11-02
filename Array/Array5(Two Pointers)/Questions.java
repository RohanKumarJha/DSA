public class Questions {
    public static void squareOrder(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int left=0, right=n-1;
        int pos = n-1;
        while(left<=right) {
            if(arr[left]*arr[left] > arr[right]*arr[right]) {
                newArr[pos] = arr[left]*arr[left];
                left++;
            } else {
                newArr[pos] = arr[right]*arr[right];
                right--;
            } pos--;
        }
        for(int i=0; i<n; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    // public static void sortEvenOdd(int[] arr) {
    //     int n = arr.length;
    //     int s=0, e=n-1;
    //     while(s<e) {
    //         if(arr[s]%2==0 && arr[e]%2!=0) {
    //             s++;
    //             e--;
    //         } else if(arr[s]%2!=0 && arr[e]%2==0) {
    //             int temp = arr[s];
    //             arr[s] = arr[e];
    //             arr[e] = temp;
    //         } else if(arr[s]%2==0) e--;
    //         else s++;
    //     }
    //     for(int i=0; i<n; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void sort(int[] arr) {
    //     int s=0, e=arr.length-1;
    //     while(s < e) {
    //         if(arr[s]==0 && arr[e]==1) {
    //             s++;
    //             e--;
    //         } else if(arr[s]==1 && arr[e]==0) {
    //             int temp = arr[s];
    //             arr[s] = arr[e];
    //             arr[e] = temp;
    //             s++;
    //             e--;
    //         } else if(arr[s]==1) {
    //             e--;
    //         } else {
    //             s++;
    //         }
    //     }
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        // Question1
        // int[] arr = {1,1,1,0,0,1,0,0,0};
        // sort(arr);

        // Question2
        // int[] arr = {3,6,7,9,1,13,16,46,89,22};
        // sortEvenOdd(arr);

        // Question3
        int[] arr = {-10,-3,-2,1,4,5};
        squareOrder(arr);
    }
}