public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {

        if (s.length() == 0) {
            return 0;
        }
        int lastWordLength = 0;
        int currentWordLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currentWordLength++;
                lastWordLength = currentWordLength;
            }else {
                currentWordLength = 0;
            }

        }

        return lastWordLength;
    }
}
