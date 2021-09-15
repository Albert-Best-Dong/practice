package Te;


import java.util.Scanner;

public class ShuiXianHua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int res = getRes(n, m);
        System.out.println(res);


    }

    private static int getRes(int n, int m) {
        if (n < 3 || n > 7 || m < 0) {
            return -1;
        }

        int num = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            num = num * 10;
        }
        for (int i = num/10; i < num; i++) {
            if (isShuiXianHua(i)) {
                if (count == m) {
                    return i;
                } else {
                    count++;
                }
            }
        }

        return -1;
    }

    private static boolean isShuiXianHua(int i) {

        String s = String.valueOf(i);
        char[] cc = s.toCharArray();
        int len = s.length();
        int[] nums = new int[len];
        int tmp = 0;
        for (int j = 0; j < len; j++) {
            nums[j] = Integer.valueOf(String.valueOf(cc[j]));

            tmp = (int) Math.pow(Double.valueOf(nums[j]),Double.valueOf(len))+tmp;
        }

        if (i == tmp) {
            return true;

        } else {
            return false;
        }
    }


}
