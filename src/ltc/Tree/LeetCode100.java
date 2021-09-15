package ltc.Tree;

public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = false;
        if(p==null&&q==null) return true;
        if((p==null&&q!=null)||(q==null&&p!=null)) return false;

        if (p.val == q.val) {
            if((p.left!=null&&q.left==null)||(q.left!=null&&p.left==null)){
                return false;
            }else if(p.left!=null&&q.left!=null&&p.left.val==q.left.val){
                if(!isSameTree(p.left,q.left)) return flag;
                else flag = true;
            }else if(p.left==null&&q.left==null){
                //flag = isSameTree(p.left,q.left);
            }else if(p.left!=null&&q.left!=null&&p.left.val!=q.left.val){
                return flag;
            } else {
                flag = false;
            }

            if ((p.right != null && q.right == null) || (q.right != null && p.right == null)) {
                return false;
            } else if (p.right != null && q.right != null) {
                if (p.right.val == q.right.val)
                     if(!isSameTree(p.right, q.right)) return false;
                     else return true;
                else
                    return flag;
            } else if (p.right == null && q.right == null) {
                flag = true;

            }else {
                return false;
            }
        } else {
            return false;
        }

        return flag;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);

        p.left = new TreeNode(2);
//        p.right = new TreeNode(3);
//        p.right = new TreeNode(2);
//        p.right.left = new TreeNode(3);
        TreeNode q = new TreeNode(1);
//        q.right = new TreeNode(2);
//        q.right.right = new TreeNode(3);
        q.left = new TreeNode(3);
//        q.right = new TreeNode(3);

        System.out.println(new LeetCode100().isSameTree(p, q));
    }
}
