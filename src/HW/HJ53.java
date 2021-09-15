package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int res = findRes(num);
            System.out.println(res);
        }
    }

    private static int findRes(int num) {
        List<Integer> resLine = generateYangHui(num);

        if (num == 1 || num == 2) {
            return -1;
        }

        for (Integer e: resLine
             ) {
            if (e % 2 == 0) {
                return resLine.indexOf(e);
            }
        }
        return -1;
    }

    private static List generateYangHui(int num) {
        int[][] yanghui = new int[num][num];
        List<Integer> list = new ArrayList<>();
        yanghui[0][0] = 1;
        yanghui[1][0] = 1;
        yanghui[1][1] = 1;
        yanghui[1][2] = 1;
        for (int i = 2; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else if (j<3) {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j - 1];
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j] + yanghui[i][j - 1];
                }
            }
        }

        for (int i = 0; i < num; i++) {
            list.add(yanghui[num][i]);
        }
        return list;
    }


}
