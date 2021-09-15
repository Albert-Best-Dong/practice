package ltc;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode551 {
    public boolean checkRecord(String s) {

        int numA = 0;
        int lenL = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                numA++;
                if (numA>=2){
                    flag =  false;
                    break;
                }

            }

            if (s.charAt(i) == 'L') {
                lenL++;
                if (lenL >= 3) {

                    flag = false;
                    break;
                }
            } else {
                lenL = 0;
            }

        }

        System.out.println(lenL);
        return flag;
    }

    public static void main(String[] args) {
        String s = "PAPALLP";
        System.out.println(new LeetCode551().checkRecord(s));
    }

}
