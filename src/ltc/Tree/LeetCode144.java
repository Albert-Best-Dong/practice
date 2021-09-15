package ltc.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        TreeNode index = root;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return new ArrayList<Integer>();

        while(index!=null){
            list.add(index.val);
            stack.push(index);
            if(index.left!=null){
                index = index.left;
            }else{
                while(!stack.isEmpty()){
                    if (stack.peek().right!=null){
                        index=stack.pop().right;
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) index = null;
                    }
                }
//                if (stack.isEmpty()) index = null;


            }
//            if (stack.isEmpty()) {
//                list.add(index.val);
//                break;
//            }

        }

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
//        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> list= new LeetCode144().preorderTraversal(root);
        for (Integer n :
                list) {
            System.out.println(n);
        }
    }
}
