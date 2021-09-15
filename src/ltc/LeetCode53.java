package ltc;

import java.util.Arrays;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;

        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i=1;i<len;i++){
            if(dp[i-1]>0) dp[i] = nums[i]+dp[i-1];
            else dp[i] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.println(dp[i]);
        }
        Arrays.sort(dp);
        for (int i = 0; i < len; i++) {
            System.out.println(dp[i]);
        }
        return dp[len-1];
    }

    public static void main(String[] args) {
        new LeetCode53().maxSubArray(new int[]{2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
}
