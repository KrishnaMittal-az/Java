public class Bin_to_Dec {
    public static void main(String[] args) {
        int n = 101011;
        int sum = 0;
        int mul = 1;
        while(n > 0) {
            int rem = n % 10;
            sum = sum + rem * mul;
            mul = mul * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }

}
