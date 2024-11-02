public class Question {
    public static void mult(int[][] arr1,int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print((arr1[i][j]*arr2[i][j])+" ");
            } System.out.println();
        }
    }
    // public static void sum(int[][] arr1,int[][] arr2) {
    //     int row = arr1.length;
    //     int col = arr1[0].length;
    //     for(int i=0; i<row; i++) {
    //         for(int j=0; j<col; j++) {
    //             System.out.print((arr1[i][j]+arr2[i][j])+" ");
    //         } System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        // Question1
        // int[][] arr1 = {{2,3},{4,5}};
        // int[][] arr2 = {{1,2},{3,4}};
        // sum(arr1,arr2);

        // Question2
        int[][] arr1 = {{2,3},{4,5}};
        int[][] arr2 = {{1,2},{3,4}};
        mult(arr1,arr2);
    }
}