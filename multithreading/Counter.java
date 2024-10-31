public class Counter {
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }

  public static void main(String[] args) {
    Counter c = new Counter();
    int noOfThreads = 10;
    Thread[] t = new Thread[noOfThreads];
    for (int i = 0; i < noOfThreads; i++) {
      t[i] = new Thread(() -> {
        for (int j = 0; j < 1000; j++) {
          c.increment();
        }
      });
      t[i].start();
    }
    for (Thread thread : t) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("final counter value: " + c.getCount());
  }
}
