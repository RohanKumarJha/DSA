public class Solution {
    // Question 1
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

    // Question 2
    public static void factorialIterative(int n) {
        int ans = 1;
        for(int i=1; i<=n; i++) {
            ans *= i;
        } System.out.println("Factorial is "+ans);
    }
    public static int factorialRecursive(int n) {
        if(n==0 || n==1) return 1;
        return n*factorialRecursive(n-1);
    }
    public static int ternaryFactorial(int n) {
        return (n==1 || n==0) ? 1 : n*ternaryFactorial(n-1);
    }

    // Question 3
    public static void fibonacciIterative(int n) {
        int[] arr = new int[n];
        if(n==1) arr[0]=1;
        else if(n==2) arr[0]=1; arr[1]=1;
        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // Question 4
    public static void sumOfDigitsIterative(int n) {
        int noOfDigit = 0;
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            noOfDigit++;
            n /= 10;
        } System.out.println("The sum of digit is "+sum);
        System.out.println("The number of digits is "+noOfDigit);
    }
    public static void sumOfDigitsRecursive(int n,int noOfDigit,int sum) {
        if(n == 0) {
            System.out.println("The sum of digit is "+sum);
            System.out.println("The number of digits is "+noOfDigit);
            return;
        } sumOfDigitsRecursive(n/10, noOfDigit+1, sum+(n%10));
    }

    // Question 5
    public static void kMultiplesOfNumberIterative(int n,int k) {
        for(int i=k; i<=n; i+=k) {
            System.out.print(i+" ");
        } System.out.println();
    }
    public static void kMultiplesOfNumberRecursive(int n,int k,int kCopy) {
        if(k > n) return;
        kMultiplesOfNumberRecursive(n, k+kCopy, kCopy);
        System.out.print(k+" ");
    } 

    // Question 6
    public static void sumOfNumberOppositeSignIterative(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = (i%2==0)?sum-i:sum+i;
        } System.out.println("The sum is "+sum);
    }
    public static void sumOfNumberOppositeSignRecursive(int n,int sum) {
        if(n == 0) {
            System.out.println("The sum is "+sum);
            return;
        }
        if(n%2==0) sumOfNumberOppositeSignRecursive(n-1, sum-n);
        else sumOfNumberOppositeSignRecursive(n-1, sum+n);
    }

    // Question 7
    public static void GCDIterative(int num1,int num2) {
        int min = Math.min(num1,num2);
        for(int i=min; i>0; i--) {
            if(num1%i==0 && num2%i==0) {
                min = i;
                break;
            }
        } System.out.println("The GCD is "+min); 
    }
    public static void GCDRecursive(int num1,int num2) {
        int min = Math.min(num1, num2);
        if(num1==1 || num2==1) {
            System.out.println("The GCD is "+1);
            return;
        }
        if(num1%min==0 && num2%min==0) {
            System.out.println("The GCD is "+min); 
            return;
        } 
        int temp = num1;
        num1 = num2;
        num2 = temp%num2;
        GCDRecursive(num1, num2);
    }

    // Question 8
    public static void printArrayIterative(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArrayRecursive(int[] arr,int n) {
        if(n < 0) return;
        printArrayRecursive(arr, n-1);
        System.out.print(arr[n]+" ");
    }

    // Question 9
    public static boolean elmExistOrNotIterative(int[] arr,int elm) {
        for(int i : arr) {
            if(i==elm) return true;
        } return false;
    }
    public static boolean elmExistOrNotRecursive(int[] arr,int idx,int elm) {
        if(idx < 0) return false;
        if(arr[idx] == elm) return true;
        elmExistOrNotRecursive(arr, idx-1, elm);
        return false;
    }
}
