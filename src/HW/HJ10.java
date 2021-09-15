package HW;

import java.util.HashSet;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
