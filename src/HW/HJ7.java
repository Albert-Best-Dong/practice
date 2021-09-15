package HW;

import java.util.Scanner;

/**
 * 描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述：
 * 输入一个正浮点数值
 *
 * 输出描述：
 * 输出该数值的近似整数值
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = s.split("\\.");
        char t = ss[1].charAt(0);
        String re = Character.toString(t);
        int a = Integer.valueOf(re);
        if (a >= 5) {
            System.out.println(Integer.valueOf(ss[0])+1);
        } else {
            System.out.println(Integer.valueOf(ss[0]));

        }

    }
}
