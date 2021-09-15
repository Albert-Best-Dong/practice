package HW;

import java.util.Scanner;

public class CalCharNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String ori = sc.next();
        System.out.println(ori);
        char[] chars = ori.toLowerCase().toCharArray();
        String a = sc.next();
        char c = a.toLowerCase().charAt(0);
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
