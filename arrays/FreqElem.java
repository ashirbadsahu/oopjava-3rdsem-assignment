import java.util.Arrays;

public class FreqElem {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 99, 18, 12, 12, 9, 15, 22, 1, 24 };
    getFrequency(nums);
  }

  static void getFrequency(int[] nums) {
    Arrays.sort(nums);
    int currentElem = nums[0];
    int freq = 1;
    System.out.println("freq of each element:");
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == currentElem) {
        freq++;
      } else {
        System.out.println(currentElem + ": " + freq);
        currentElem = nums[i];
        freq = 1;
      }
    }
    System.out.println(currentElem + ": " + freq);

  }

}
