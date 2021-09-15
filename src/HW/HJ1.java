package HW;

import java.util.Scanner;

/**
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
 * <p>
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 * <p>
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 * <p>
 * 示例1
 * 输入：
 * hello nowcoder
 * 复制
 * 输出：
 * 8
 * <p>
 * 说明：
 * 最后一个单词为nowcoder，长度为8
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String s = sc.next();
        String[] strings = s.split(" ");
        String last = strings[strings.length - 1];
        System.out.println(last.length());
    }
}
