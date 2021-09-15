package ltc.Tree;


public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root.right, root.left);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if (p==null||q==null) return false;
        return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(new LeetCode101().isSymmetric(root));
    }
}
