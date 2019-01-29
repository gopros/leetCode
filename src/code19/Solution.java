package code19;

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode  p = head;
        ListNode start = head,end=null,prev = null;
        int i = 1;
        while (p!=null){
            if (n==i){
                end = p;
                break;
            }
            i++;
            p=p.next;
        }

        if (head==null){
            return null;
        }

        while (end.next!=null){
            prev = start;
            start = start.next;
            end = end.next;
        }

        if (prev!=null){
            prev.next = start.next;
        }else {
            head = head.next;
        }



        return head;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        ListNode listNode = s.removeNthFromEnd(d,1);
        ListNode p = listNode;
        while (p!=null){
            System.out.println(p.val);
            p = p.next;
        }


    }



}
