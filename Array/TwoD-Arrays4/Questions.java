public class Questions {
    public static void sumOfRectangle(int[][] arr,int r1,int c1,int r2,int c2) {
        int sum=0;
        for(int i=r1; i<=r2; i++) {
            for(int j=c1; j<=c2; j++) {
                sum += arr[i][j];
            }
        } System.out.println("The sum of triangle is "+sum);
    }
    public static void main(String[] args) {
        // Question1
        int[][] arr = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7},{5,6,7,8}};
        int r1=1, c1=1, r2=4, c2=3;
        sumOfRectangle(arr,r1,c1,r2,c2);
    }
}