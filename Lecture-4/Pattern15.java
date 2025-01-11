public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 0;
        int star = n;
        while(row <= 2*n-1) {
            //space
            int i = 1 ;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            //next prep
            row++;
            if(row > n) {
                star++;
                space-=2;   //space = space - 2;
            } else {
                star--;
                space+=2;   // star = star + 2;
            }
            System.out.println();
        }
    }

}
