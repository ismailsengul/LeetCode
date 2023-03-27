public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String reverse = "";
        for(int i=number.length()-1;i>=0;i--){
            reverse+=number.charAt(i);
        }

        return number.equals(reverse) ;
    }
}
