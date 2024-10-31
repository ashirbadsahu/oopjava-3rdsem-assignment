class EvenNumbers extends Thread {
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println("Even: " + i);
      }
    }
  }
}

class OddNumbers extends Thread {
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        System.out.println("Odd: " + i);
      }
    }
  }
}

public class NumberPrinter {
  public static void main(String[] args) {
    EvenNumbers evenThread = new EvenNumbers();
    OddNumbers oddThread = new OddNumbers();

    evenThread.start();
    oddThread.start();
  }
}
