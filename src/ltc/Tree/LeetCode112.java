package ltc.Tree;

public class LeetCode112 {
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(targetSum-root.val==0) return true;
        dfs(root, targetSum);
        return flag;
    }

    public void dfs(TreeNode root, int target) {
        if (target == 0) {
            flag = true;
            return;
        }
        if (target < 0) {
            return;
        }
        if(root==null) return;

        dfs(root.left, target - root.val);
        dfs(root.right, target - root.val);
    }
}
