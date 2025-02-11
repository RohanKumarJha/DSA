public class Solution {
    public static void allNumberIterative(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(i+" ");
        }
    }
    public static void allNumberRecursive(int n) {
        if(n == 0) return;
        allNumberRecursive(n-1);
        System.out.print(n+" ");
    } 

    public static void factorialIterative(int n) {
        int ans = 1;
        for(int i=1; i<=n; i++) {
            ans *= i;
        } System.out.println("Factorial of "+n+" using iterative approach is "+ans);
    }
}
