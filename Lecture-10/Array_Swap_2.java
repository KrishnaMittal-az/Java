public class Array_Swap_2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8};
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr, 0, 1);
    }

    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
