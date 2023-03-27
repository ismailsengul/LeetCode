import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }

    public static  int romanToInt(String s) {
        HashMap<Character,Integer> symbolValues = new HashMap<>();
        int result = 0;

        symbolValues.put('I',1);
        symbolValues.put('V',5);
        symbolValues.put('X',10);
        symbolValues.put('L',50);
        symbolValues.put('C',100);
        symbolValues.put('D',500);
        symbolValues.put('M',1000);

        for(int i=0;i<s.length();i++){

            if(i<s.length()-1 && symbolValues.get(s.charAt(i))<symbolValues.get(s.charAt(i+1))){
                result+=symbolValues.get(s.charAt(i+1)) - symbolValues.get(s.charAt(i));
                i++;
            }else{
                result+=symbolValues.get(s.charAt(i));
            }
        }

        return result;

    }
}
