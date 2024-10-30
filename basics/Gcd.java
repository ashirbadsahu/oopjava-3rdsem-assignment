public class Gcd {
  public static void main(String[] args) {
    int a = 10, b = 20;
    for (int i = b; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        System.out.println("gcd is " + i);
        break;
      }
    }
  }
}
