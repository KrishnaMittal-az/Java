public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        int space = n - star;
        while (row <= n) {
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
            space++;
            star--;
            System.out.println();
        }
    }

}
