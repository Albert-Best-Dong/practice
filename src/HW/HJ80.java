package HW;

import java.util.*;

/**
 * 描述
 * 题目标题：
 *
 * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
 * 输出时相邻两数之间没有空格。
 * 请注意本题有多组样例。
 *
 *
 *
 * 输入描述：
 * 输入说明，按下列顺序输入：
 * 1 输入第一个数组的个数
 * 2 输入第一个数组的数值
 * 3 输入第二个数组的个数
 * 4 输入第二个数组的数值
 *
 * 输出描述：
 * 输出合并之后的数组
 */

public class HJ80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n1=sc.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<n1;i++){
                set.add(sc.nextInt());
            }
            int n2=sc.nextInt();
            for(int i=0;i<n2;i++){
                set.add(sc.nextInt());
            }
            Object[] res=set.toArray();
            Arrays.sort(res);
            for(int i=0;i<res.length;i++){
                System.out.print((int)res[i]);
            }
            System.out.println();
        }
    }
}
