import java.util.Arrays;

public class Question {
    public static void reverse(int[] arr) {
        int start=0, end=arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();
    }

    public static void maxElement(int[] arr) {
        int maxElm = Integer.MIN_VALUE;
        for(int i : arr) {
            maxElm = Math.max(i,maxElm);
        } System.out.println("The maximum element is "+maxElm);
    }

    public static void mergeTwoArray1stMethod(int[] arr1,int[] arr2) {
        int index = 0;
        for(int i=arr2.length; i<arr1.length; i++) {
            arr1[i] = arr2[index++];
        } Arrays.sort(arr1);
        for(int i : arr1) {
            System.out.print(i+" ");
        } System.out.println();
    }

    public static void mergeTwoArray2ndMethod(int[] arr1,int[] arr2) {
        int curElm1=arr1.length-arr2.length-1, curElm2=arr2.length-1;
        int curElm = arr1.length-1;
        while(curElm1!=0 & curElm2!=0) {
            arr1[curElm--] = (arr1[curElm1]>arr2[curElm2])?arr1[curElm1--]:arr2[curElm2--];
        }
        while(curElm1!=0) {
            arr1[curElm--] = arr1[curElm1--];
        }
        while(curElm2!=0) {
            arr1[curElm--] = arr2[curElm2--];
        }
        for(int i : arr1) {
            System.out.print(i+" ");
        } System.out.println();
    }

    public static void removeDuplicate1stMethod(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == -1) break;
                if(arr[i] == arr[j]) arr[j]=-1;
            }
        } 
        for(int i : arr) {
            if(i != -1) System.out.print(i+" ");
        } System.out.println();
    }

    public static void removeDuplicate2ndMethod(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(i==0) {
                System.out.print(arr[i]+" ");
            } else if(arr[i]!=arr[i-1]) {
                System.out.print(arr[i]+" ");
            }
        } System.out.println();
    }

    public static void rotateArray1stMethod(int[] arr,int rotateElm) {
        rotateElm %= arr.length;
        int len = arr.length;
        int[] newArr = new int[len];
        for(int i=0; i<len; i++) {
            newArr[i] = arr[(len-rotateElm+i)%len];
        }
        for(int i : newArr) {
            System.out.print(i+" ");
        } System.out.println();
    }

    public static void rotate(int[] arr,int start,int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }

    public static void rotateArray2ndMethod(int[] arr,int rotateElm) {
        rotateElm %= arr.length;
        rotate(arr, 0, arr.length-1);
        rotate(arr, 0, rotateElm-1);
        rotate(arr, rotateElm, arr.length-1);
        for(int i : arr) {
            System.out.print(i+" ");
        } System.out.println();
    }
}