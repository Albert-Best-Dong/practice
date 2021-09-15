package ltc.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;

        Stack<ListNode> stack = new Stack<>();
        Queue<ListNode> queue = new LinkedList<>();
        ListNode pre =null;

        while (head != null) {

            stack.push(head);
            head = head.next;
            if (stack.size() == 2) {
                ListNode l2 = stack.pop();
                ListNode l1 = stack.pop();
                head=l2.next;
                l2.next = l1;
                l1.next=null;
                queue.offer(l2);
                queue.offer(l1);
                continue;
            }
        }
        if(!stack.isEmpty()) queue.offer(stack.pop());

        ListNode res = queue.peek();
        head = queue.poll();
        while (!queue.isEmpty()) {
            head.next = queue.poll();
            head = head.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode res = new LeetCode24().swapPairs(head);
        while (res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
