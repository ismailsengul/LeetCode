public class AddBinary {

    /**
     * Given two binary strings a and b, return their sum as a binary string.

     * Example 1:
     * Input: a = "11", b = "1"
     * Output: "100"

     * Example 2:
     * Input: a = "1010", b = "1011"
     * Output: "10101"

     * Constraints:
     * 1 <= a.length, b.length <= 104
     * a and b consist only of '0' or '1' characters.
     * Each string does not contain leading zeros except for the zero itself.
     */


    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println( addBinary(a,b));
    }

    public static String addBinary(String a, String b) {


        /* Fill missing digits with 0 */
        if (a.length() < b.length()) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < b.length() - a.length(); i++) {
                sb.append("0");
            }

            a = sb + a;
        }

        if (b.length() < a.length()) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < a.length() - b.length(); i++) {
                sb.append("0");
            }

            b = sb + b;
        }


        int x = 0;

        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1; i >= 0 ; i--) {
            int sum = (a.charAt(i) - ('0')) + (b.charAt(i) - ('0')) + x;

            if (sum < 2) {
                result.append(sum);
                x = 0;
            } else if (sum == 2) {
                result.append(0);
                x = 1;
            } else {
                result.append(1);
                x = 1;
            }


        }

        if (x == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}
