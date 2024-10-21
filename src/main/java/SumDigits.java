public class SumDigits {
    public static int sumDigits (long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sumDigits(234)); // Output: 9
        System.out.println(sumDigits(12345)); // Output:15
        System.out.println(sumDigits(0)); // Output: 0
        System.out.println(sumDigits(987654321)); // Output: 45

    }
}
    
        