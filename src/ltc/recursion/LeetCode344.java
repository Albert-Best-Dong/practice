package ltc.recursion;

public class LeetCode344 {
    public  void reverseString(char [] str) {
        int len = str.length;
        int mid = len / 2;
        helper(0, str,mid);
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

    private  void helper(int index, char [] str,int mid) {
        if (str == null || index >= str.length) {
            return;
        }

        if (index  < mid) {
            char tmp = str[index];
            str[index] = str[str.length - index - 1];

            str[str.length - index - 1] = tmp;
            helper(index + 1, str, mid);
//            System.out.print(str[index]);
        }




//        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        new LeetCode344().reverseString(chars);
    }
}
