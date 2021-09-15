package ltc;

import java.util.*;

public class LeetCode22 {
    List<String> list = new ArrayList<>();
    TreeMap<Integer, Character> map = new TreeMap<>();
    public List<String> generateParenthesis(int n) {
        char[] chs = new char[2*n];
        for(int i=0;i<n;i++){
            chs[i] = '(';
        }
        for(int i=n;i<2*n;i++){
            chs[i] = ')';
        }
        map.put(0, '(');
        dfs(chs,n,map);

        return list;
    }

    public void dfs(char[] chs, int n, TreeMap<Integer,Character> map) {

        String temp = mapToString(map);
        if(temp.charAt(0)==')') return;
        if (isValid(mapToString(map)) && map.size() == chs.length&&!list.contains(mapToString(map))) {
            list.add(mapToString(map));
            return;
        }
        for (int i = 1; i < 2 * n; i++) {
            if (map.containsKey(i)) {
                continue;
            }
            map.put(i, chs[i]);

            dfs(chs, n, map);

            map.remove(i);
        }
    }

    public String mapToString(TreeMap<Integer, Character> map) {
        StringBuilder sb = new StringBuilder();

        for (Character c:
                map.values()) {
            sb.append(c);
        }
        return sb.toString();
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(')
                stack.push(c);
            else{
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(c==')'&&top!='(') return false;

            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(new LeetCode22().generateParenthesis(5));
    }
}
