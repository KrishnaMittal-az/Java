public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;
        while(row <= n) {
            //space 
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }
            //star or epsilon
            int j = 1;
            while (j <= star) {
                if(j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            // next prep
            row++;
            star+=2;    // star = star + 2
            space--;
            System.out.println();
        }
    }

}
