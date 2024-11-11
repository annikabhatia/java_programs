public class fibonacci_recursion {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.print(fibonacci(input));
    }
    
}
