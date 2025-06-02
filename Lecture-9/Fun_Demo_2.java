public class Fun_Demo_2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(Add());
    }

    public static int Add(){
        int a = 8;
        int b = 9;
        int c = a + b;
        int d = Sub();
        return c + d;
    }

    public static int Sub() {
        int a = 9;
        int b = 7;
        int c = a - b;
        return c;
    }
}
