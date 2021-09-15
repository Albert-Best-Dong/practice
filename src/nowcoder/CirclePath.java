package nowcoder;

import java.util.*;

public class CirclePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sc = scanner.nextInt();
        int yc = scanner.nextInt();
        int r = scanner.nextInt();
        int count = 1;
        int[][] square = new int[n][n];
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < n; j++) {
                square[i][j] = count++;
            }
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<=n;i++){
            for (int j = 0; j <=n ; j++) {
                if (r * r < (sc - j) * (sc - j) + (yc - (n-i)) * (yc - (n-i))
                &&r * r <= (sc - j) * (sc - j) + (yc - (n-i-1)) * (yc - (n-i-1))) {
                    if(sc-j>r||yc-(n-i)>r||yc - (n-i-1)>r) continue;
                    if (i < n && j < n &&yc - (n-i-1)<=r&&sc - j<=r) {
                            set.add(square[i][j]);
                    }else if (i==n&&j==n) set.add(square[i - 1][j - 1]);
                }
            }
        }

        if (set.isEmpty()) {
            System.out.println(-1);
            return;
        }

        for (Integer e :
                set) {
            System.out.print(e+" ");
        }

    }
}
