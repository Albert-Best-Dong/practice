package ltc.level;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode116 {
    public Node connect(Node root) {
        if(root==null) return null;
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Node> list = new ArrayList<>();
            int k = queue.size();
            for (int i = 0; i < k; i++) {
                Node cur = queue.poll();
                list.add(cur);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            for (int i = 0; i + 1 < list.size(); i++) {
                list.get(i).next = list.get(i + 1);
            }
        }
        return root;

    }

    public void bfs(Node root, PriorityQueue<Node> queue) {
        root.next = null;
        queue.offer(root);
        while (!queue.isEmpty()) {
            queue.poll();
            queue.offer(root.left);
            queue.offer(root.right);
            root.left.next = root.right;
            root.right.next = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

    }
}
