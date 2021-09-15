package ltc.dsf;

import java.util.*;

public class LeetCode17 {
    List<String> res = new ArrayList<>();
    Map<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        int len = digits.length();
        char[][] cc = new char[len][];
        for(int i=0;i<len;i++){
            String s = map.get(digits.charAt(i));
            cc[i] = s.toCharArray();
        }
        backtrack(cc,0,new StringBuffer());
        return res;
    }

    private void backtrack(char[][] cc,int i,StringBuffer sb){


        if (!res.contains(sb.toString())&&sb.length()==cc.length) {
            res.add(sb.toString());
            return;
        }

        char[] chars = cc[i];

        for (int l = 0; l < chars.length; l++) {


            sb.append(chars[l]);

            backtrack(cc, i+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode17().letterCombinations("23"));
    }
}
