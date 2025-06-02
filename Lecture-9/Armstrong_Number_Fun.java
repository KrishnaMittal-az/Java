public class Armstrong_Number_Fun {
    public static void main(String[] args) {
        int x = 371;
        int n = 3;
        System.out.println(Arm(x, n));
    }

    public static boolean Arm(int a, int n) {
        boolean flag = false;
        int p = 0;
        int num = a; 
        int ans = 0;
        while(num > 0) {
            int r = num % 10;
            p =(int) Math.pow(r,n);
            num = num /10;
            ans = ans + p;
        }
        if (a == ans) {
            flag = true;
        }
        return flag;
    }

}
