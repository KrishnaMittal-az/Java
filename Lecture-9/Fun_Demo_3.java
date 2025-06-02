public class Fun_Demo_3 {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 8;
        int b = 10;
        System.out.println(val);
        System.out.println(Add(a,b));
        System.out.println(val);

        // System.out.println(Add(a,b));
    }
    
    // public static int Add(int a , int b) {
    //     int c = a + b;
    //     return c;
    // }

    public static int Add (int a , int b ) {
        int c = a + b;
        int val = 60;
        val = val + 5;
        return c - Sub(c , b);
    }

    public static int Sub(int a , int b ) {
        int c = a - b;
        return c;
    }

    

}
