public class recursion_factorial {

    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.print(factorial(input));
    }



}
