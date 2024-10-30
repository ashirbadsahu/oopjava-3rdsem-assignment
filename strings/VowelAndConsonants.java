public class VowelAndConsonants {
  public static void main(String[] args) {
    int vowelCount = 0, consonantCount = 0;
    String str = "erm what the sigma?";
    char[] ch = str.toCharArray();
    for (int i = 0; i < str.length(); i++) {
      if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
        vowelCount++;
      } else {
        consonantCount++;
      }
    }
    System.out.println("vowel count: " + vowelCount + ", consonant count: " + consonantCount);
  }
}
