public class Prime {
  static boolean primeCheck(int n) {
    boolean isPrime = true;
    if (n == 2)
      return true;

    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        isPrime = false;
    }
    return isPrime;
  }

  public static void main(String[] args) {
    for (int i = 2; i < 20; i++) {
      if (primeCheck(i)) {
        System.out.print(i + ", ");
      }
    }
  }
}
