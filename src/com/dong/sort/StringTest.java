package com.dong.sort;

import java.util.HashMap;

public class StringTest {
    public static void main(String[] args) {
        String a = "abcdea";
        String sub = a.substring(2);
        StringBuffer sb = new StringBuffer("708");
        HashMap map = new HashMap();
        String bb = String.valueOf(708);
        StringBuffer s = new StringBuffer(bb);
        String s1 = a.substring(0, 1);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(Integer.parseInt(String.valueOf(sb.charAt(i))));
        }
        System.out.println(Integer.parseInt("99999999999"));
        System.out.println(sb.charAt(2));
    }
}
