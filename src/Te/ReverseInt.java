package Te;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 非字符串
 */
public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int max = 2147483647;
        int min = -2147483648;
        String res = "";
        if (n > 0) {
            char[] cs = s.toCharArray();
            if (cs.length < 10) {
                for (int i = cs.length - 1; i > 0; i--) {
                    res = res + String.valueOf(cs[i]);
                }
                System.out.println(Integer.valueOf(res));
            } else if (cs.length == 10) {

            }

        }

    }
}
