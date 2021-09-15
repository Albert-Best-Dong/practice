package ltc.ListNode;

import java.util.Stack;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null&&n==1) return null;
        Stack<ListNode> stack = new Stack<>();

        ListNode index = head;
        while (index != null) {
            stack.push(index);
            index = index.next;
        }

        while (n > 0) {
            stack.pop();
            n--;
        }

        stack.peek().next = stack.peek().next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode l = head;
//        for (int i = 2; i <= 5; i++) {
//            l.next = new ListNode(i);
//            l = l.next;
//        }

        head = new LeetCode19().removeNthFromEnd(head, 1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
