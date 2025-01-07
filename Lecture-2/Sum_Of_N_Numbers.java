public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int sum = 0;
        while(i < n) {
            sum += i; // sum = sum + i
            i += 1;
        }
        System.out.println(sum);
    }

}
