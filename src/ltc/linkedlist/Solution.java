package ltc.linkedlist;

import java.util.ArrayList;

public class Solution {
    private  ArrayList<Integer> arrayList = new ArrayList<>();
    public  boolean isValidBST(TreeNode root) {
        search(root);
        if(root==null) return true;
        return true;
    }

    private void add(TreeNode root) {
        arrayList.add(root.val);
    }
    private  void search(TreeNode root) {
        if(root.left!=null)
            search(root.left);
        add(root);
        if(root.right!=null)
            search(root.right);
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(15);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(20);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
//        root.right = new TreeNode(4);
//        root.left.left = null;
//        root.left.right = null;
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(6);


        System.out.println(new Solution().isValidBST(root));

    }
}
