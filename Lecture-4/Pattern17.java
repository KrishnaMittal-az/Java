public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int star = n/2;
        int space = 1;
        while (row <= n) {
            //lstar
            int i = 1;
            while (i <= star) {
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
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            //next prep
            row++;
            if(row>n/2+1) {
                star++;
                space-=2;
            } else {
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
}
