public class power {
    public static void main(String[] args) {
        System.out.println(powerCalc(3, 3));
    }

    public static int powerCalc(int base, int exp) {
        if (base == 0) {
            return 0;
        }
        if (base == 1 || exp == 0) {
            return 1;
        }

        return base * powerCalc(base, exp - 1);
    }
}
