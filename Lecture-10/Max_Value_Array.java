public class Max_Value_Array {
    public static void main(String[] args) {
        int[] arr = {5,4,7,5,3,6,9,8,2,5,4,8,10,45,1,2,5};
        System.out.println(maxi(arr));
    }
    public static int maxi(int[] arr) {
        int num = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    } 

}
