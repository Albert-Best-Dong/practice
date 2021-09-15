package HW;

import java.util.Scanner;

public class HJ61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int appleNum = sc.nextInt();
        int plateNum = sc.nextInt();
        int res = process(appleNum, plateNum);
        System.out.println(res);
    }

    private static int process(int appleNum, int plateNum) {
        int[][] dp = new int[plateNum][appleNum];

        int remain = 0;

        if (appleNum < 0 || plateNum < 0) {

            return 0;
        }



        for (int i = 0; i < plateNum; i++) {
            for (int j = 0; j < appleNum; j++) {
                dp[i][j] = j+1;
            }
        }
        for (int i = plateNum; i >= 0; i--) {
            for (int j = 0; j < appleNum; j++) {
                remain = 7 - dp[i][j];
                process(remain, plateNum - i);
            }

        }


//        for (int i = 0; i < plateNum; i++) {
//            for (int j = 0; j < appleNum; j++) {
//
//            }
//        }

        return 0;
    }


}
