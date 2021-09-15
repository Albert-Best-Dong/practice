package ltc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int tmp = x;
        Stack<Integer> stack =new Stack<>();
        while(tmp!=0){
            int a = tmp % 10;
            stack.push(a);
            tmp = tmp/10;
        }
        int len = stack.size();

        for(int i = 0;i<len;i++){
            tmp=tmp+(int)Math.pow(10,i)*stack.pop();
        }
        System.out.println(tmp);
        if (tmp == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode9().isPalindrome(122));
    }
}
