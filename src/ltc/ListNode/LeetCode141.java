package ltc.ListNode;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
//        Map<ListNode,Integer> map = new HashMap<ListNode,Integer>();
//        while(head.next!=null){
//            if(!map.containsKey(head)){
//                map.put(head,0);
//                head=head.next;
//            }else{
//                return false;
//            }
//        }
//
//        if(map.isEmpty()) return true;
//        for(Integer n: map.values()){
//            if(n!=0) return false;
//        }
//        return true;
        if(head==null||head.next==null) return false;

        if(head==head.next) return true;

        ListNode brik = head.next;
        head.next=head;

        return hasCycle(brik);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        new LeetCode141().hasCycle(head);
    }
}
