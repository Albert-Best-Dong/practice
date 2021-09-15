package ltc.ListNode;

import java.util.List;
import java.util.Stack;

public class LeetCode143 {
    Stack<ListNode> stack = new Stack<>();

    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;

        ListNode l = head;
        while(l!=null){
            stack.push(l);
            l=l.next;
        }
        l= head;
        int n = stack.size()/2;
        reorder(l,stack);
    }

    public void reorder(ListNode h, Stack<ListNode> s){
        // if(s.isEmpty()) return;
        if(h.next==s.peek()||h.next==s.peek()) {
            h.next=null;
            return;
        }

        ListNode l = h.next;
        ListNode ls = s.pop();
        ls.next = null;
        h.next = ls;
        ls.next = l;
        h=l;
        reorder(h,s);

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        new LeetCode143().reorderList(head);
    }
}
