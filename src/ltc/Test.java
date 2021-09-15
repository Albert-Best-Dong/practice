package ltc;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer ss = new StringBuffer();
        ArrayList<Character> list = new ArrayList<>();

        list.add('a');
        list.add('b');
        String s = "";

        for (int i = 0; i < list.size(); i++) {
            s = s + list.get(i);
        }

        char[] cc = new char[]{'a', 'b', 'c'};
        new String(cc);
        System.out.println(new String(cc));
        String x = "abcdef";
        System.out.println(x.substring(0, 2));
        Stack<Character> stack = new Stack<>();


    }
}
