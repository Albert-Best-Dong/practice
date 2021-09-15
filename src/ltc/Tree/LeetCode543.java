package ltc.Tree;

public class LeetCode543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;


        return depthOfTree(root.left) + depthOfTree(root.right);
    }

    public int depthOfTree(TreeNode l){
        if(l==null) return 0;
        int depth = Math.max(depthOfTree(l.left),depthOfTree(l.right));
        return depth;
    }

    public static void main(String[] args) {

    }
}
