public class Array_Demo {
    public static void main(String[] args) {
        int a;
        int[] arr = new int[5];
        System.out.println(arr);

        int[] other = arr;
        arr[0] = 9;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 5;
        arr[4] = 8;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        
        
        System.out.println(other.length);
    }
}
