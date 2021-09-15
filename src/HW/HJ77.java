package HW;

import java.util.Scanner;
import java.util.Stack;

public class HJ77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String strNums = sc.next();
        String[] s = strNums.split(" ");
        int len = s.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.valueOf(s[i]);
            System.out.println(nums[i]);
        }
        

    }
}
