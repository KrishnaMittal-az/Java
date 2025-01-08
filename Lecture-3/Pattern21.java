public class Pattern21 {
    public static void main(String[] args) {
        int n = 6;
        int lstar = 1;
        int space = 2*n - 3;
        int rstar = 1;
        int row = 1;
        while(row <= n) {
            //lstar
            int i = 1;
            while (i <= lstar) {
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            //rstar
            int k = 1;
            if(row == n) {
                k = 2;
            }
            while (k <= rstar) {
                System.out.print("* ");
                k++;
            }
            //next prep
            row++;
            rstar++;
            space-=2;   //space = space - 2;
            lstar++;
            System.out.println();
        }
    }

}
