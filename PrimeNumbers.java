//java program to print prime numbers between 1 to n without using scanner class
class PrimeNumbers {
  public static void main(String[] args) {
    int n = 20; 
    System.out.println("Prime numbers between 1 and " + n + " are:");
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}