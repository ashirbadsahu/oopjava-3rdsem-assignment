public class Fib {
  static int nFib(int n){
    if(n<=1) {
      return n;
    }
    return nFib(n-1) + nFib(n-2);
  }
  public static void main(String[] args) {
    for (int i = 1; i <= 8; i++) {
    System.out.print(nFib(i)+", ");
    }
  }
}
