package ltc.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();

        bfs(root,list);
        return res;
    }

    private void bfs(TreeNode root, LinkedList<Integer> list) {
        if(root==null){
            res.add(list);
            return;
        }

        list.offer(root.val);
        bfs(root.left, list);
    }
}
