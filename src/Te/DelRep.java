package Te;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * 给出由字母组成的字符串str，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 示例​：
 * 输入："abaaca"
 * 输出："abca"
 * 解释：
 * 例如，在 "abaaca" 中，我们可以删除 "aa" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "abca".
 */
public class DelRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();
        int pre = 0, las = 1;
        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {

        }
    }
}
