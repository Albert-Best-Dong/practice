package ltc.Tree;



import java.util.Stack;

public class LeetCode104 {
    int depth = 0;
    int left = 0;
    int right = 0;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode tmp = null;

    public int maxDepth(TreeNode root) {


        if (root != null) {
            stack.push(root);
            if(depth<stack.size()) depth = stack.size();
        }
        if(root.left!=null){
            root=root.left;
            maxDepth(root);
        }

        if (root.right != null) {
            root = root.right;

            maxDepth(root);
            root.right = null;

        } else {
//            if(stack.isEmpty()) return depth;
//            root = stack.peek();
            while (!stack.isEmpty()) {
                root = stack.peek();
                if (root.left == null && root.right == null) {
                    tmp = stack.pop();
                    if(stack.isEmpty()) return depth;
                    root = stack.peek();
                    if(root.left==null) root.right = null;
                } else if (root.right != null) {

                    root.left = null;
                    root = root.right;
                    maxDepth(root);
                } else {
                    if (tmp == root.left) {
                        root.left = null;
                        maxDepth(root);
                    }
                }

            }


        }


        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);
        System .out.println(new LeetCode104().maxDepth(root));
    }
}
