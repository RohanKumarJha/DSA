public class Questions {
    public static void sort(int[] arr) {
        int s=0, e=arr.length-1;
        while(s < e) {
            if(arr[s]==0 && arr[e]==1) {
                s++;
                e--;
            } else if(arr[s]==1 && arr[e]==0) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            } else if(arr[s]==1) {
                e--;
            } else {
                s++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // Question1
        int[] arr = {1,1,1,0,0,1,0,0,0};
        sort(arr);
    }
}