package ltc.Tree;

public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if(root ==null) return true;
        int leftHeight = dfs(root.left,0);
        int rightHeight = dfs(root.right,0);

        if(Math.abs(leftHeight-rightHeight)<=1) return isBalanced(root.left)&&isBalanced(root.right);
        else return false;
    }

    public int  dfs(TreeNode root,int height){
        if(root==null) {
            return height;
        }
        height=height+1;
        return Math.max(dfs(root.left,height),dfs(root.right,height));

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        System.out.print(new LeetCode110().isBalanced(root));
    }
}
