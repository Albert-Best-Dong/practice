package HW;

import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (!s.matches("[A-Z]")) {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
