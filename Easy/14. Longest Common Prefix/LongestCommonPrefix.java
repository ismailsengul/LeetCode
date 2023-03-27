public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};


        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String current = strs[0];

        for (int i = 0; i < current.length(); i++) {
            for (int j = 0; j < strs.length; j++) {

                if (strs[j].length() > i && current.charAt(i) == strs[j].charAt(i)) {
                    if (j == strs.length-1) {
                        result+=current.charAt(i);
                    }
                }
            }
        }

        return result;
    }
}
