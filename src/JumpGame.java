public class JumpGame {
    public static int canJump(int[] nums) {
        int sum =0;
        int n = nums.length;
        int count = 0;
        sum = sum +nums[0];
        int[] dp = new int[n];
        for (int i = 0; i < i+nums[i]; i++) {
            sum = sum+nums[i]+i;
            count++;
        }
        if(sum>=nums.length) return count;
        else return 0;
    }


    public static void main(String[] args) {
        int[] a = {3,2,3,1,1,4};
        System.out.println(canJump(a));
    }
}
