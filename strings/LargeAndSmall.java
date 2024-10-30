public class LargeAndSmall {
  public static void main(String[] args) {
    String str = "My name is Walter Hartwell White";
    String[] splitStr = str.split("\\s+");
    String largestWord = "";
    String smallestWord = "";

    for (String word : splitStr) {
      if (word.length() > largestWord.length()) {
        largestWord = word;
      }
      if (smallestWord.isEmpty() || word.length() < smallestWord.length()) {
        smallestWord = word;
      }
    }
    System.out.println("smallest word: " + smallestWord + ", largest word: " + largestWord);
  }
}
