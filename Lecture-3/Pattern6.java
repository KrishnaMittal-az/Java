public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        while(row <= n) {
            //space
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            //next prep
            row++;
            space = space + 2;
            star--;
            System.out.println();
        }
    }

}
