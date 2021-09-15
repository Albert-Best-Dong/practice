package ltc.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root.left != null) {

            while(root.left!=null){
                stack.push(root);
                root =root.left;
            }

        } else if (root.right != null) {
            stack.push(root);
            root = root.right;
            if (root.left != null) {
                while(root.left!=null){
                    stack.push(root);
                    root =root.left;
                }
            }

        }else {
            stack.push(root);

        }





        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(new LeetCode145().postorderTraversal(root));
    }
}
