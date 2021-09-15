package ltc;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int[] res =new int[nums.length];
        int point = 0, step = k;
        for (int i = 0; i < nums.length; i++) {
             point = i;
            dfs(nums, res, point, step, i);


        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
            System.out.print(nums[i] + " ");
        }
    }

    public void dfs(int[] nums, int[] res, int index, int step,int ori) {
        if(step==0){
            res[index] = nums[ori];
            return;
        }
        if (index == nums.length-1 && step > 0) {
            dfs(nums, res, 0, --step, ori);
        } else if (index < nums.length-1 && step > 0) {
            dfs(nums, res, ++index, --step, ori);

        }

    }

    public static void main(String[] args) {
        new LeetCode189().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
