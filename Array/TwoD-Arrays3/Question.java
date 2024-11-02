
public class Question {
    public static void printSpiral(int n) {
        int row=n, col=n;
        int totElm=1;
        int rowStart=0, rowEnd=row-1, colStart=0, colEnd=col-1;
        int[][] arr = new int[row][col];
        while(totElm <= row*col) {
            for(int i=colStart; i<=colEnd&&totElm<=row*col; i++) {
                arr[rowStart][i] = totElm;
                totElm++;
            } rowStart++;
            for(int i=rowStart; i<=rowEnd&&totElm<=row*col; i++) {
                arr[i][colEnd] = totElm;
                totElm++;
            } colEnd--;
            for(int i=colEnd; i>=colStart&&totElm<=row*col; i--) {
                arr[rowEnd][i] = totElm;
                totElm++;
            } rowEnd--;
            for(int i=rowEnd; i>=rowStart&&totElm<=row*col; i--) {
                arr[i][colStart] = totElm;
                totElm++;
            } colStart++;
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            } System.out.println();
        }
    }
    // public static void spiralMatrix(int[][] matrix) {
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     int rowStart=0, colStart=0, rowEnd=row-1, colEnd=col-1;
    //     int totElm = 0;
    //     while(totElm < row*col) {
    //         for(int i=colStart; i<=colEnd && totElm<row*col; i++) {
    //             System.out.print(matrix[rowStart][i]+" ");
    //             totElm++;
    //         } rowStart++;
    //         for(int i=rowStart; i<=rowEnd && totElm<row*col; i++) {
    //             System.out.print(matrix[i][colEnd]+" ");
    //             totElm++;
    //         } colEnd--;
    //         for(int i=colEnd; i>=colStart && totElm<row*col; i--) {
    //             System.out.print(matrix[rowEnd][i]+" ");
    //             totElm++;
    //         } rowEnd--;
    //         for(int i=rowEnd; i>=rowStart && totElm<row*col; i--) {
    //             System.out.print(matrix[i][colStart]+" ");
    //             totElm++;
    //         } colStart++;
    //     }        
    // }

    public static void main(String[] args) {
        // Question1
        // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // spiralMatrix(matrix);

        // Question2
        int n=3;
        printSpiral(n);
    }
}