import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrimeSumTask implements Runnable {
  private final int start, end;
  private static int totalSum = 0;

  public PrimeSumTask(int start, int end) {
    this.start = start;
    this.end = end;
  }

  private synchronized void addToTotal(int sum) {
    totalSum += sum;
  }

  private boolean isPrime(int num) {
    if (num <= 1)
      return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  @Override
  public void run() {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (isPrime(i))
        sum += i;
    }
    addToTotal(sum);
  }

  public static int getTotalSum() {
    return totalSum;
  }
}

public class PrimeSum {
  public static void main(String[] args) {
    int limit = 100;
    int threads = 4;
    ExecutorService executor = Executors.newFixedThreadPool(threads);
    int range = limit / threads;

    for (int i = 0; i < threads; i++) {
      executor.execute(new PrimeSumTask(i * range + 1, (i + 1) * range));
    }
    executor.shutdown();

    while (!executor.isTerminated()) {
    }
    System.out.println("Sum of prime numbers up to " + limit + " is: " + PrimeSumTask.getTotalSum());
  }
}
