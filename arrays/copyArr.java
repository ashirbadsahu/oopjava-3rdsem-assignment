import java.util.Arrays;

public class copyArr {
  public static void main(String[] args) {
    int[] arr1 = { 10, 12, 9, 6, 12, 5 };
    int[] arr2 = Arrays.copyOf(arr1, arr1.length);
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}
