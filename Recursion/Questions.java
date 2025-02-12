import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                int[] arr = {2,5,7,6,3,4,8};

                // Method 1 - Using Iterative approach
                Solution.printArrayIterative(arr);
                System.out.println();

                // Method 2 - Using recursive approach
                Solution.printArrayRecursive(arr, arr.length-1);
                System.out.println();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the element ");
            int elm = Integer.parseInt(br.readLine());
            // Question 9 - elm exist or not

                // Method 1 - Using iterative approach
                System.out.println("Element is "+(Solution.elmExistOrNotIterative(arr, elm)?"present":"not present"));

                // Method 2 - Using recursive approach
                System.out.println("Element is "+(Solution.elmExistOrNotRecursive(arr,arr.length-1, elm)?"present":"not present"));

            // Question 10 - return all the indices
    }
}