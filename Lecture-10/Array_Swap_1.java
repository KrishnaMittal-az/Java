public class Array_Swap_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
}
