package ltc.dsf;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {
    List<String> ans = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        String lower = s.toLowerCase();
        String upper = s.toUpperCase();
        ans.add(s);

        return ans;
    }

    public void backtrack(String lowwer, String upper, StringBuffer sb) {

        if (ans.contains(sb.toString())) {
            return;
        }
        for (int i = sb.length(); i < lowwer.length(); i++) {

            if (!isLetter(lowwer.charAt(i))) {
                sb.append(upper.charAt(i));
            }
        }
    }

    public boolean isLetter(char c) {
        if(c>=97&&c<=122||c>=65&&c<=90) return true;
        else return false;
    }
}
