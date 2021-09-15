package ltc.level;

import ltc.level.TreeNode;

import java.util.LinkedList;

public class BinaryTreeLevelOrder {
    public void levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int k = queue.size();
            for (int i = 0; i < k; i++) {
                TreeNode cur = queue.poll();

                if (cur.left != null) {
                    queue.offer(cur.left);
                }

                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
    }
}
