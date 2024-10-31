class StringException {
    void checkVowels(String input) throws Exception {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("The string does not contain any vowels.");
        }
    }

    public static void main(String[] args) {
        StringException c = new StringException();
        String testString = "rhythm";

        try {
            c.checkVowels(testString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        testString = "hello";
        try {
            c.checkVowels(testString);
            System.out.println("The string contains vowels.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
