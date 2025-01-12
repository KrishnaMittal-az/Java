import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int ans = 0;
        if(n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            for(int i = 2 ; i <= n ; i++) {
                ans = a + b;
                a = b;
                b = ans;
            }
            System.out.println(ans);
        }
        sc.close();
    }

}
