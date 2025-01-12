import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean Flag = true;

        for(int i = 2 ; i <= n-1 ; i++) {
            if(n % i == 0) {
                Flag = false;    
            }
        }
        if (Flag == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }

}
