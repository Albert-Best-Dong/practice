package ltc.Tree;


import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        if(root.left!=null){
            list.add(root.left.val);
            inorderTraversal(root.left);
        }
        if(root!=null){
            list.add(root.val);
            if(root.right!=null){
                inorderTraversal(root.right);
                list.add(root.right.val);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        TreeNode ll=root.right
    }
}
