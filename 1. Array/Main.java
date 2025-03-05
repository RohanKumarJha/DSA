public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // Question 1 - Reverse an array
        Question.reverse(arr);

        // Question 2 - Find maximum element
        Question.maxElement(arr);

        // Question 3 - Merge two soted array
        int[] arr1 = {1,2,3,0,0,0}, arr2={2,3,4};
        Question.mergeTwoArray1stMethod(arr1, arr2);

        // Question 3 - Merge two soted array
        Question.mergeTwoArray2ndMethod(arr1, arr2);

        // Question 4 - Remove duplicates
        int[] arr3 = {1,2,3,2,2,1,3,4};
        Question.removeDuplicate1stMethod(arr3);

        // Question 4 - Remove duplicates
        int[] arr4 = {1,2,3,2,2,1,3,4};
        Question.removeDuplicate2ndMethod(arr4);

        // Question 5 - Rotate Array
        int[] arr5 = {1,2,3,4,5,6,7,8,9};
        Question.rotateArray1stMethod(arr5,3);

        // Question 5 - Rotate Array
        int[] arr6 = {1,2,3,4,5,6,7,8,9};
        Question.rotateArray2ndMethod(arr6,4);
    }
}
