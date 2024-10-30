public class UpperTri {

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 0, 1 },
        { 2, 1, 4 },
        { -1, 7, 9 }
    };
    System.out.println("Upper Triangular Matrix:");
    printUpperTriangular(matrix);
  }

  public static void printUpperTriangular(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i <= j) {
          System.out.print(matrix[i][j] + " ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}
