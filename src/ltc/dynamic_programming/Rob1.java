package ltc.dynamic_programming;

public class Rob1 {
    public int rob(int[] nums) {

        int max = 0;

        int len = nums.length;
        int[][] dp = new int[nums.length + 1][nums.length + 1];

        for (int i = 1; i < len+1 ; i++) {
            dp[i][i] = nums[i - 1];
            for (int j = i; j < len+1; j++) {
                if (j - i > 1) {
                    dp[i][j] = nums[j-1] + nums[i-1];
                } else if(j - i == 1){
                    dp[i][j] = 0;
                }
                System.out.print(dp[i][j] + " ");

            }
            System.out.println();
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Rob1().rob(new int[]{2,7,9,3,1,4,6,3,7,1,8}));
    }
}
