public class Fun_Demo_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Add();
        System.out.println("Bye World");
    }    
    public static void  Add() {
        int a = 7;
        int b = 8;
        int c = a + b;
        Sub();
        System.out.println(c);
    }
    public static void  Sub() {
        int a = 8;
        int b = 7;
        int c = a - b;
        System.out.println(c);
    }
}