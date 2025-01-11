public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while(row <= 2*n-1) {
            //star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            //next prep
            row++;
            if(row > 5) {
                star--;
            } else {
                star++;
            }
            System.out.println();
        }
    }

}
