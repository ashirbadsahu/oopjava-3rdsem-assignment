public class OddChecker {
  void checkOdd(int num) throws Exception {
    if (num % 2 != 0) {
      throw new Exception("number " + num + " isnt odd");
    }
  }

  public static void main(String[] args) {
    OddChecker oc = new OddChecker();

    int num1 = 10;
    try {
      oc.checkOdd(num1);
    } catch (Exception e) {
      System.out.println(e);
    }

    int num2 = 25;
    try {
      oc.checkOdd(num2);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
