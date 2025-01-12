import java.util.Scanner;

public class HCF_or_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mini = Math.min(a, b);
        int ans = 0;
        for(int i = 1 ; i <= mini ; i++) {
            if(a % i == 0 && b % i == 0) {
                ans = Math.max(ans,i);
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
