package HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            for (int i = ss.length - 1; i >= 0; i--) {
                System.out.print(ss[i]+" ");
            }
        }
    }
}
