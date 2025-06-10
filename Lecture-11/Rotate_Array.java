public class Rotate_Array {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7};
     int k = 3;

     rotateArray(arr, k);

     for(int i = 0 ; i < arr.length; i++) {
        System.out.println(arr[i]);
     }


    }

    // public static void rotateArray(int[] arr, int k) {
    //     int n = arr.length;
    //     k = k% n;
    //     for(int j = 1 ; j <= k; j++ ) {
    //         int item = arr[n - 1];
    //         for(int i = n - 2; i>=0 ;i--) {
    //             arr[i+1] = arr[i];
    //         }
    //         arr[0] = item;
    //     }
    // }

    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0, k-1);
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr, int start, int end) {
        
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
