public class SearchQuestion {
    public static void main(String[] args) {

        // Question 1
        // int[] arr = {0,1,2,3,4,5,7,8,9,10,11};
        // int start=0, end=arr.length-1;
        // while(start < end) {
        //     int mid = start+(end-start)/2;
        //     if(arr[mid] == mid) start=mid+1;
        //     else end=mid-1;
        // } System.out.println("The missing number is "+start);

        // Question 2
        // int[] arr = {12,34,23,19,45,10,5};
        // Arrays.sort(arr);
        // int start=0, end=arr.length-1;
        // int target = 79;
        // while(start < end) {
        //     if(arr[start]+arr[end]==target) break;
        //     else if(arr[start]+arr[end] < target) start++;
        //     else end--;
        // } System.out.println((arr[start]+arr[end]==target)?(arr[start]+","+arr[end]):"Not exists");

        // Question 3
        // int[] arr = {5,6,0,1,2,3,4};
        // int target = 0;
        // int start=0, end = arr.length-1;
        // while(start <= end) {
        //     int mid = (start+end)/2;
        //     if(arr[mid] == target) {
        //         System.out.println(mid);
        //         break;
        //     } else if(arr[start] < arr[mid]) {
        //         if(arr[start]<=target & target<=arr[end]) end=mid;
        //         else start=mid+1;
        //     } else {
        //         if(arr[mid]<=target & target<=arr[end]) start=mid;
        //         else end=mid-1;
        //     }
        // }

        // Question 4
        int[] nums = {1,2,1,3,5,6,4};
        if(nums.length==1) System.out.println(0);
        int s=0, e=nums.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(s==e) {
                System.out.println(s);
                break;
            }
            if(s==mid) {
                System.out.print(nums[s]>nums[e]?s:e);
                break;
            }
            if(nums[mid-1]<nums[mid]&nums[mid]>nums[mid+1]) {
                System.out.println(mid);
                break;
            }
            else if(nums[mid-1]<nums[mid]&nums[mid]<nums[mid+1]) {
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
    }
}
