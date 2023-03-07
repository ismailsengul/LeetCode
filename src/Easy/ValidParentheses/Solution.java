package Easy.ValidParentheses;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "([()])";
        System.out.println(isValid(s));
    }

    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Character[] open = {'{','(','['};
        Character[] close = {'}',')',']'};

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < open.length; j++) {
                if (s.charAt(i) == open[j]) {
                    stack.push(s.charAt(i));
                }else if (s.charAt(i) == close[j]){
                    try {
                        if (stack.pop() != open[j]) {
                            return false;
                        }
                    }catch (Exception e) {
                        return false;
                    }

                }
            }
        }

        return stack.empty();
    }
}


