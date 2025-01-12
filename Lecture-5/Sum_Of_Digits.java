import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0) {
            int rem = n % 10;
            ans = ans + rem;
            n = n / 10;
        }
        System.out.println(ans);
        sc.close();
    }

}
