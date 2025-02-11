import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the last element");
        int n = Integer.parseInt(br.readLine());
        
        // Question 1 - Print all the number till n, or n to 1.
                // Method 1 - Using Iterative approach
                Solution.allNumberIterative(n);
                System.out.println();

                // Method 2 - Using recursive approach
                Solution.allNumberRecursive(n);
                System.out.println();
        
        // Question 2 - Factorial of a number
                // Method 1 - Using iterative approach
                Solution.factorialIterative(n);

                // Method 2 - Using recursive approach

                // Method 3 - Using ternary opertor

    }
}