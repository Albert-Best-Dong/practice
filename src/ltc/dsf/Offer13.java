package ltc.dsf;

public class Offer13 {
    int ans = 0;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        dfs(m, n, 0, 0, k);

        return ans;
    }

    public void dfs(int m,int n,int i, int j, int k) {
        if(i<0||i>m-1||j<0||j>n-1) return;
        if(getDigitSum(i,j)>k) return;
        if(visited[i][j]) return;

        visited[i][j] = true;
        ans=ans+1;
        dfs(m, n, ++i, j, k);
        dfs(m, n, i, ++j, k);
        dfs(m, n, --i, j, k);
        dfs(m, n, i, --j, k);

    }

    public int getDigitSum(int m, int n) {
        int sum = 0;
        while (m > 0) {
            sum = sum + m % 10;
            m = m / 10;
        }
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.print(new Offer13().movingCount(1,2,1));
    }
}
