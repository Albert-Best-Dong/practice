package HW;

import java.util.*;

public class HJ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String str = sc.next();
        char[] chars = str.toCharArray();

        String[] tmp = str.split("[^a-zA-Z]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            sb.append(tmp[i]);
        }

        String s = sb.toString();
        String st = s.toLowerCase();


        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        char[] res = new char[s.length()];
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (st.charAt(i) + 32 == list.get(j) || st.charAt(i) - 32 == list.get(i)) {
                   res[i]= list.get(j);
                }
            }
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (chars[i] > 'a' && chars[i] < 'z' || chars[i] > 'A' && chars[i] < 'Z') {
                    chars[i] = list.get(j);
                }
            }

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
