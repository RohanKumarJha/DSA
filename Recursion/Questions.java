import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter the last element");
        // int n = Integer.parseInt(br.readLine());
        
            // Question 1 - Print all the number till n, or n to 1.
                // Method 1 - Using Iterative approach
                // Solution.allNumberIterative(n);
                // System.out.println();

                // Method 2 - Using recursive approach
                // Solution.allNumberRecursive(n);
                // System.out.println();
        
            // Question 2 - Factorial of a number
                // Method 1 - Using iterative approach
                // Solution.factorialIterative(n);

                // Method 2 - Using recursive approach
                // System.out.println(Solution.factorialRecursive(n));

                // Method 3 - Using ternary opertor
                // System.out.println(Solution.ternaryFactorial(n));

                // Method 4 - Using DP(Tabulation Approach)

                // Method 5 - Using DP(Memoization)

            // Question 3 - fibonacci Series
                // Method 1 - Using iterative approach
                // Solution.fibonacciIterative(n);

                // Method 2 - Using recursive approach


        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter the number");
        // int digit = Integer.parseInt(br.readLine());

            // Question 4 - Sum of digits/ Number of digits
                // Method 1 - Using iterative approach
                // Solution.sumOfDigitsIterative(digit);

                // Method 2 - Using recursive approach
                // Solution.sumOfDigitsRecursive(digit,0,0);

            // Question 5 - K multiples of number
                // System.out.println("Enter the value of k");
                // int k = Integer.parseInt(br.readLine());

                // Method 1 - Using iterative approach
                // Solution.kMultiplesOfNumberIterative(digit, k);

                // Method 2 - Using recursive approach
                // Solution.kMultiplesOfNumberRecursive(digit,k,k);
                // System.out.println();

            // Question 6 - Sum Of natural number with opposite sign
                // Method 1 - Using iterative approach
                // Solution.sumOfNumberOppositeSignIterative(k);

                // Method 2 - Using recursive approach
                // Solution.sumOfNumberOppositeSignRecursive(k,0);

            
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("Enter the first number");
            // int num1 = Integer.parseInt(br.readLine());
            // System.out.println("Enter the second number");
            // int num2 = Integer.parseInt(br.readLine());

            // Question 7 - Greatest common divisor
                // Method 1 - Using iterative approach
                // Solution.GCDIterative(num1, num2);   
                
                // Method 2 - Using recursive approach
                // Solution.GCDRecursive(num1, num2);

            // Question 8 - Print array
                // int[] arr = {2,5,7,6,3,4,8};

                // Method 1 - Using Iterative approach
                // Solution.printArrayIterative(arr);
                // System.out.println();

                // Method 2 - Using recursive approach
                // Solution.printArrayRecursive(arr, arr.length-1);
                // System.out.println();

            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("Enter the element ");
            // int elm = Integer.parseInt(br.readLine());
            // Question 9 - elm exist or not

                // Method 1 - Using iterative approach
                // System.out.println("Element is "+(Solution.elmExistOrNotIterative(arr, elm)?"present":"not present"));

                // Method 2 - Using recursive approach
                // System.out.println("Element is "+(Solution.elmExistOrNotRecursive(arr,arr.length-1, elm)?"present":"not present"));

            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = {2,3,5,6,8,1,9,1,3,1};

            // Question 10 - return all the indices
            // System.out.println("Enter the element you want to find");
            // int elm = Integer.parseInt(br.readLine());

                // Method 1 - Using iterative approach
                // Solution.allIndicesIterative(arr,elm);
                // System.out.println();

                // Method 2 - Using recursive approach
                // Solution.allIndicesRecursive(arr,elm,arr.length-1);

            // Question 11 - return all element into arrayList
                // Method 1 - Using iterative approach
                // Solution.arrayToArrayListIterative(arr);

                // Method 2 - Using recursive approach
                // List<Integer> list = new ArrayList<>();
                // Solution.arrayToArrayListRecursive(arr, list, arr.length-1);

            // Question 12 - Implemented isSorted method
                // Method 1 - Using iterative approach
                // if(Solution.isSortedIterative(arr)) System.out.println("Array is sorted");
                // else System.out.println("Array is not sorted");

                // Method 2 - Using recursive approach
                // if(Solution.isSortedRecursive(arr,arr.length-1)) System.out.println("Array is sorted");
                // else System.out.println("Array is not sorted");

            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("Enter the element ");

            // Question 13 - last index of target
                // Method 1 - Using iterative approach
                // int elm = Integer.parseInt(br.readLine());
                // System.out.println(Solution.lastIndexIterative(arr, elm));

                // Method 2 - Using recursive approach
                // int elm = Integer.parseInt(br.readLine());
                // if(Solution.lastIndexRecursive(arr, elm, arr.length-1) == -1) System.out.println("Element not found");
                // else System.out.println("Element found on "+Solution.lastIndexRecursive(arr, elm, arr.length-1)+" index");

            // Question 14 - Remove all occurence of a
                // String str = "abcax";

                // Method 1 - Using iterative approach
                // System.out.println(Solution.removeAllOccOfIterative(str));

                // Method 2 - Using recursive approach
                // StringBuilder sb = new StringBuilder();
                // System.out.println(Solution.removeAllOccOfRecursive(str, sb, 0));

            // Question 15 - Reverse String
                // String str = "Rohan Kumar Jha";

                // Method 1 - Using iterative approach
                // System.out.println(Solution.reverseStringIterative(str));

                // Method 2 - Using recursive approach
                // StringBuilder result = new StringBuilder(str);
                // System.out.println(Solution.reverseStringRecursive(result, 0, result.length()-1));

            // Question 16 - Palindrome String
                // String str = "abcba";

                // Method 1 - Using iterative approach
                // if(Solution.palindromeIterative(str)) System.out.println("String is palindrome");
                // else System.out.println("String is not palindrome");

                // Method 2 - Using recursive approach
                // if(Solution.palindromeRecursive(str,0,str.length()-1)) System.out.println("String is palindrome");
                // else System.out.println("String is not palindrome");

            // Question 17 - Palindrome Integer
                // int val = 12321;
                // String str = Integer.toString(val);

                // Method 1 - Using iterative approach
                // if(Solution.palindromeIterative(str)) System.out.println("Integer is palindrome");
                // else System.out.println("Integer is not palindrome");

                // Method 2 - Using recursive approach
                // if(Solution.palindromeRecursive(str,0,str.length()-1)) System.out.println("Integer is palindrome");
                // else System.out.println("Integer is not palindrome");

            // Question (18-19) - Subsequences
    }
}