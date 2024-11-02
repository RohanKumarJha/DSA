import java.util.ArrayList;
import java.util.List;

public class Question {
    public static void pascalTriangle(int n) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> firstElm = new ArrayList<>();
        if(n==0) {
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            firstElm.add(1);
            // matrix.add(firstElm);
            System.out.print(matrix.add(firstElm));
            List<Integer> preElm = new ArrayList<>();
            for(int j=1; j<i; j++) {
                preElm.add((matrix.get(i-1).get(j-1))+(matrix.get(i-1).get(j)));
                // matrix.add(preElm);
                System.out.print(matrix.add(preElm));
            } 
            if(i!=0) {
                // firstElm.add(1);
                // matrix.add(firstElm);
                System.out.print(matrix.add(firstElm));
            } 
            System.out.println();
        }
    }
    // public static void rotate(int[][] matrix) {
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     int[][] newMatrix = new int[row][col];
    //     System.out.println("After 90deg rotation");
    //     for(int i=0; i<row; i++) {
    //         for(int j=0; j<col; j++) {
    //             newMatrix[i][j] = matrix[row-j-1][i];
    //             System.out.print(newMatrix[i][j]+" ");
    //         } System.out.println();
    //     }
    //     System.out.println("After 180deg rotation");
    //     for(int i=0; i<row; i++) {
    //         for(int j=0; j<col; j++) {
    //             newMatrix[i][j] = matrix[row-i-1][col-j-1];
    //             System.out.print(newMatrix[i][j]+" ");
    //         } System.out.println();
    //     }
    //     System.out.println("After 270deg rotation");
    //     for(int i=0; i<row; i++) {
    //         for(int j=0; j<col; j++) {
    //             newMatrix[i][j] = matrix[j][row-i-1];
    //             System.out.print(newMatrix[i][j]+" ");
    //         } System.out.println();
    //     }
    // }
    // public static void transposeInPlace(int[][] matrix) {
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     for(int i=0; i<row; i++) {
    //         for(int j=i; j<col; j++) {
    //             if(i!=j) {
    //                 int temp = matrix[i][j];
    //                 matrix[i][j] = matrix[j][i];
    //                 matrix[j][i] = temp;
    //             }
    //         }
    //     }
    //     System.out.println("After transpose");
    //     for(int i=0; i<row; i++) {
    //         for(int j=0; j<col; j++) {
    //             System.out.print(matrix[i][j]+" ");
    //         } System.out.println();
    //     }
    // }
    // public static void transpose(int[][] matrix) {
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     int[][] newMatrix = new int[col][row];
    //     for(int i=0; i<col; i++) {
    //         for(int j=0; j<row; j++) {
    //             newMatrix[i][j] = matrix[j][i];
    //         }
    //     }
    //     System.out.println("After Transpose");
    //     for(int i=0; i<newMatrix.length; i++) {
    //         for(int j=0; j<newMatrix[0].length; j++) {
    //             System.out.print(newMatrix[i][j]+" ");
    //         } System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        // Question1
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println("Before Transpose");
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     } System.out.println();
        // } 
        // transpose(matrix);

        // Question2
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println("Before Transpose");
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     } System.out.println();
        // } 
        // transposeInPlace(matrix);  // It's applicable for square matrix only

        // Question3
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println("Before Rotate");
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     } System.out.println();
        // } 
        // rotate(matrix);

        // Question4
        pascalTriangle(5);
    }
}