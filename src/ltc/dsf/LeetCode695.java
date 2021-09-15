package ltc.dsf;

public class LeetCode695 {
    int res = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(dfs(grid,i,j),res);
                }
            }
        }

        return res;
    }

    public int dfs(int[][] grid, int i, int j){
//        if(i==grid.length&&j==grid[i].length) return;
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length) {

            if (grid[i][j] == 0) return 0;
            if (grid[i][j] == 1) {
                grid[i][j] = 0;
                return dfs(grid, i - 1, j) + dfs(grid, i, j - 1) +
                        dfs(grid, i, j + 1) + dfs(grid, i + 1, j) + 1;
            }

        } else {
            return 0;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[][] island = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(new LeetCode695().maxAreaOfIsland(island));


    }
}
