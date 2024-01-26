package app_java_important;

public class FibonacciWithRecursion {

	public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
