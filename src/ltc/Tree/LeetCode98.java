package ltc.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode98 {
    Stack<Integer> stack =new Stack<>();
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        flag = preOrderSearch(root);

        return flag;

    }

    public boolean preOrderSearch(TreeNode root){
        if(root.left!=null) preOrderSearch(root.left);
        if (stack.isEmpty()) {
            stack.push(root.val);

        }else {
            if (root.val < stack.peek()) {

                flag = false;
                return flag;
            }
            stack.push(root.val);
        }
        if(root.right!=null) preOrderSearch(root.right);

        return flag;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(new LeetCode98().isValidBST(root));

    }
}
