package ltc.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode994 {
    int ans = 0;
    int[][] orange;
    PriorityQueue<int[]> queue = new PriorityQueue<>();
    public int orangesRotting(int[][] grid) {

        orange = grid;
        int level = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        bfs(level);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }

    public void bfs(int level) {
            if (!queue.isEmpty()) {
                int k = queue.size();

                for (int l = 0; l < k; l++) {
                    int[] r = queue.poll();
                    int i = r[0];
                    int j = r[1];
                    if (i - 1 >= 0 && orange[i - 1][j] == 1) {
                        orange[i - 1][j] = 2;
                        queue.offer(new int[]{i - 1, j});
                    }
                    if (i +1 < orange.length && orange[i + 1][j] == 1) {
                        orange[i + 1][j] = 2;
                        queue.offer(new int[]{i + 1, j});
                    }

                    if (j - 1 >= 0 && orange[i][j - 1] == 1) {
                        orange[i][j - 1] = 2;
                        queue.offer(new int[]{i, j - 1});
                    }
                    if (j + 1 <orange[0].length && orange[i][j +1] == 1) {
                        orange[i][j + 1] = 2;
                        queue.offer(new int[]{i, j + 1});
                    }
                }
                if (!queue.isEmpty()) {
                    ans = ans + 1;
                }
                bfs(level + 1);


            }
    }



    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}};
        System.out.println(new LeetCode994().orangesRotting(grid));
        System.out.println(new LeetCode994().orangesRotting(new int[][]{{1, 2}}));
    }
}
