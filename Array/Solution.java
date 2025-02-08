import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static void swapElm(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    // Solution 1
    public static void noOfOccurence(int[] arr,Scanner sc) {
        System.out.println("Enter the element in which frequency, you want to print");
        int freq = sc.nextInt();
        int count = 0;
        for(var i : arr) {
            if(freq==i) count++;
        } System.out.println("The frequency of that element is "+count);
    }

    // Solution 2
    public static String lastOccurence(int[] arr,Scanner sc) {
        System.out.println("Enter the element in which last occurence, you want to print");
        int lastOccurence = sc.nextInt();
        int idx = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==lastOccurence) idx=i;
        } 
        String str = idx==-1 ? "Element not exist" : "position of element is "+idx;
        return str;
    }

    // Solution 3
    public static int[] smallestAndLargestElm(int[] arr,Scanner sc) {
        int smallest=Integer.MAX_VALUE, largest=Integer.MIN_VALUE;
        for(var i : arr) {
            if(i < smallest) smallest=i;
            if(i > largest) largest=i;
        } return new int[]{smallest,largest};
    }

    // Solution 4
    public static int[] swapElm(int elm1,int elm2) {
        elm1 += elm2;
        elm2 = elm1-elm2;
        elm1 -= elm2;
        return new int[] {elm1,elm2};
    }

    // Solution 5
    public static int[] kSwap(int[] arr,int k) {
        int size = arr.length;
        int[] result = new int[size];
        k %= size;
        for(int i=0; i<size; i++) {
            if(i+k < size) result[i+k]=arr[i];
            else result[(i+k)%size]=arr[i];
        } return result;
    }

    // Solution 6
    public static Map<Integer,Integer> frequencyOfElm(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            if(!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i)+1);
        } return map;
    }

    // Solution 7
    public static int[] sortZeroOne(int[] arr) {
        int first=0, last=arr.length-1;
        while(first < last) {
            if(arr[first]!=0 & arr[last]!=1) {
                swapElm(arr,first, last);
                first++; last--;
            } else if(arr[first] == 0) first++;
            else last--;
        } return arr;
    }  
    
    // Solution 8
    public static int[] sortEvenOdd(int[] arr) {
        int start=0, end=arr.length-1;
        while(start < end) {
            if(arr[start]%2!=0 & arr[end]%2==0) {
                swapElm(arr, start, end);
                start++; end--;
            } else if(arr[start] %2 == 0) start++;
            else end--;
        } return arr;
    }

    // Solution 9
    public static int[] squareOrder(int[] arr) {
        int size = arr.length;
        int start=0, end=size-1;
        int[] newArr = new int[size];
        int i=size-1;
        while(start <= end) {
            if(arr[start]*arr[start] < arr[end]*arr[end]) {
                newArr[i] = arr[end];
                end--;
            } else {
                newArr[i] = arr[start];
                start++;
            } i--;
        } return newArr;
    }

    // Solution 10
    public static int maxSum(int[] arr) {
        int size = arr.length;
        int sum=0, maxSum=0;
        for(int i=0; i<size; i++) {
        sum += arr[i];
        if(sum < 0) sum=0;
        maxSum = Math.max(maxSum, sum);
        } return maxSum;
    }

    // Solution 11
    public static void equalSumArray(int[] arr) {
        int sum = 0;
        for(var i : arr) {
            sum += i;
        }
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            arr2.add(arr[i]);
        }
        int val=0, i=0;
        while(val < sum-val) {
            val += arr[i];
            arr1.add(arr[i]);
            arr2.remove(i);
            i++;
            if(val == sum-val) break;
        }
        System.out.println("First arrayList");
        for(int j=0; j<arr1.size(); j++) {
            System.out.print(arr1.get(j)+" ");
        }
        System.out.println();
        System.out.println("Second arrayList");
        for(int j=0; j<arr2.size(); j++) {
            System.out.print(arr2.get(j)+" ");
        }
    }

    // Solution 12
    public static int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++) {
            for(int j=i; j<col; j++) {
                if(i!=j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        } return arr;
    }

    // Solution 13
    public static int[][] rotateMatrix90Deg(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        arr = transpose(arr);
        for(int i=0; i<row; i++) {
            int start=0, end=col-1;
            while(start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++; end--;
            }
        } return arr;
    }

    // Solution 14
    public static List<List<Integer>> pascalTriangle(int noOfRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(noOfRows == 0) return list;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);
        List<Integer> preRow = new ArrayList<>();
        preRow = firstRow;
        for(int i=1; i<noOfRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j=1; j<i; j++) {
                currRow.add(preRow.get(j-1)+preRow.get(j));
            } currRow.add(1);
            preRow = currRow;
            list.add(currRow);
        } return list;
    }
}
