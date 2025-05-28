import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Implementation {

    // 🔸 Kadane’s Algorithm (Max Subarray Sum)
    static int maxSubArray(int[] nums) {
        int currSum=0, maxSum=0;
        int pointer = 0;
        while(pointer != nums.length) {
            currSum += nums[pointer];
            currSum = (currSum > 0) ? currSum : 0;
            maxSum = Math.max(maxSum, currSum);
            pointer++;
        }
        return maxSum;
    }

    // 🔸 Two-sum (Using HashMap)
    static int[] twoSum(int[] arr,int sum) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(sum-arr[i])) {
                return new int[]{map.get(sum-arr[i]),i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};
    }

    // 🔸 Move Zeros to End
    static int[] moveZeros(int[] arr) {
        int start=0, end=0;
        while(end != arr.length) {
            if(arr[end] != 0) {
                arr[start++] = arr[end++];
            } else {
                end++;
            }
        } while(start != arr.length) {
            arr[start++] = 0;
        } return arr;
    }

    // 🔸 Longest Substring Without Repeating Characters
    static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    } 

    public static void main(String[] args) {
        // Test Kadane's Algorithm
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Kadane's Max Sum: " + maxSubArray(nums));

        // Test Two Sum
        int[] arr = {2,7,11,15};
        System.out.println("Two Sum: " + Arrays.toString(twoSum(arr, 17)));

        // Test Move Zeros
        int[] arr2 = {0,1,0,3,1};
        moveZeros(arr2);
        System.out.println("Move Zeros: " + Arrays.toString(arr2));

        // Test Longest Substring without repeating characters
        String s = "abcabcbb";
        System.out.println("Longest Substring Length: " + lengthOfLongestSubstring(s));
    }

}