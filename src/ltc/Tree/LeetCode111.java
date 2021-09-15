package ltc.Tree;

public class LeetCode111 {
    int ans = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        dfs(root, 1);
        return ans;
    }

    public void dfs(TreeNode root, int height){
        if(root!=null&&root.left==null&&root.right==null) {
            ans = Math.min(height, ans);
            return;
        }
        height = height + 1;
        dfs(root.left, height);
        dfs(root.right, height);

    }
}
