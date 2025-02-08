import java.util.List;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of an array ");
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // Question 1
        // Solution.noOfOccurence(arr,sc);

        // Question 2
        // String str = Solution.lastOccurence(arr, sc);
        // System.out.println(str);

        // Question 3
        // int[] result = Solution.smallestAndLargestElm(arr, sc);
        // System.out.println("The smallest element is "+result[0]+", and the largest element is "+result[1]);

        // Question 4
        // System.out.println("Enter both the elements");
        // int elm1=sc.nextInt(), elm2=sc.nextInt();
        // int result[] = Solution.swapElm(elm1,elm2);
        // System.out.println("Before swapping the elements will be "+elm1+", "+elm2);
        // System.out.println("After swapping the elements will be "+result[0]+", "+result[1]);

        // Question 5
        // System.out.println("Enter the value,in which you want to rotate the array");
        // int k = sc.nextInt();
        // System.out.println("After rotation array will be ");
        // for(int i : Solution.kSwap(arr, k)) {
        //     System.out.print(i+" ");
        // }

        // Question 6
        // System.out.println("Frequency of elements is : ");
        // Map<Integer,Integer> map = Solution.frequencyOfElm(arr);
        // for(var i : map.entrySet()) {
        //     System.out.println(i.getKey()+" : "+i.getValue());
        // }

        // Question 7
        // int[] nums = {1,1,1,0,0,1,0,0,0};
        // for(var i : Solution.sortZeroOne(nums)) {
        //     System.out.print(i+" ");
        // }

        // Question 8
        // for(var i : Solution.sortEvenOdd(arr)) {
        //     System.out.print(i+" ");
        // }

        // Question 9
        // for(var i : Solution.squareOrder(arr)) {
        //     System.out.print(i+" ");
        // }

        // Question 10
        // System.out.println("The maxSum is "+Solution.maxSum(arr));

        // Question 11
        // Solution.equalSumArray(arr);

        // Question 12
        // int[][] result = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] answer = Solution.transpose(result);
        // for(int i=0; i<answer.length; i++) {
        //     for(int j=0; j<answer[0].length; j++) {
        //         System.out.print(answer[i][j]+" ");
        //     } System.out.println();
        // }

        // Question 13
        int[][] result = {{1,2,3},{4,5,6},{7,8,9}};
        result = Solution.rotateMatrix90Deg(result);
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            } System.out.println();
        }

        // Question 14 - Part 1
        System.out.println("Enter the rows of pascal's triangle");
        int noOfRows = sc.nextInt();
        List<List<Integer>> list = Solution.pascalTriangle(noOfRows);
        System.out.println(list);

        // Question 14 - Part 2
        System.out.println("Enter the rows, you want to print");
        int rowNumber = sc.nextInt();
        System.out.println(Solution.pascalTriangle(noOfRows).get(rowNumber));
    }
}