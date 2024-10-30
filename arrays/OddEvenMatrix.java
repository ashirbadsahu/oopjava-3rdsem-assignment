public class OddEvenMatrix {
  public static void main(String[] args) {
    int oddCount = 0, evenCount = 0;
    int[][] nums = { { 1, 2 }, { 2, 4 } };

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i][j] % 2 == 0) {
          evenCount++;
        } else {
          oddCount++;
        }
      }
    }
    System.out.println("odd: " + oddCount + " even: " + evenCount);
  }
}
