package ltc.dsf;

import java.util.Map;

public class LeetCode733 {

    boolean[][] canNotUse;
    int[][] res;
    int target;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        canNotUse = new boolean[image.length][image[0].length];
        res = image;
        target = newColor;
        int src = image[sr][sc];
        dfs(res,sr,sc,src);
        return res;
    }

    public void dfs(int[][] image, int sr, int sc, int src) {
        if(sr==image.length&&sc==image[0].length) return;
        if(sr<0||sc<0||sr==image.length||sc==image[0].length) return;

        if(canNotUse[sr][sc]) return;

        if(!canNotUse[sr][sc]){
            if (image[sr][sc]==src){
                canNotUse[sr][sc] = true;
                image[sr][sc] = target;
            }
        }

        if (sr - 1 >= 0&&canNotUse[sr][sc]) {
            dfs(image, sr-1, sc, src);
        }
        if (sc - 1 >= 0&&canNotUse[sr][sc]) {
            dfs(image, sr, sc-1, src);

        }
        if (sr + 1 < image.length&&canNotUse[sr][sc]) {
            dfs(image, sr+1, sc, src);
        }
        if (sc + 1 < image[0].length&&canNotUse[sr][sc]) {
            dfs(image, sr, sc+1, src);
        }

    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] res = new LeetCode733().floodFill(image, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
