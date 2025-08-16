//program to generate fibonacci series
class fibo{
    public static void main(String[] args) {
        int n = 10; // Length of the Fibonacci series
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}

