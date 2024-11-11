public class countDigits {

    public static int countingDigits(int count) {
        if (count < 10) {
            return 1;
        }
        return 1 + countingDigits(count/10);

    }
    public static void main(String[] args) {
        System.out.println(countingDigits(2345));
    }
}
