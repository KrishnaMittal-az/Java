public class Product_Except_Self {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4};
        int[] ans = prod(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] prod(int[] arr) {
        int mul = 1;
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            mul = mul * arr[i];
        }
        for(int i = 0 ; i < arr.length; i++) {
            ans[i] = mul/arr[i];
        }
        return ans;
    }

}
