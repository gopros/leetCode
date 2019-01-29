package code148;


import java.util.List;

class Solution {

    public ListNode sortList(ListNode head) {

        if (head==null||head.next==null) return head;

        ListNode fast = head,slow = head,pre = head;

        while(fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        return  merge(sortList(head),sortList(slow));




    }

    public ListNode merge(ListNode letf,ListNode right){

        ListNode listNode = new ListNode(0), p = listNode;

        while (letf!=null&&right!=null){
            if (letf.val<right.val){
                p.next = new ListNode(letf.val);
                p = p.next;
                letf = letf.next;
            }else {
                p.next = new ListNode(right.val);
                p = p.next;
                right = right.next;
            }
        }

        if (letf!=null){
            p.next = letf;
        }
        if (right!=null){
            p.next = right;
        }

        return listNode.next;


    }

    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        ListNode l = s.sortList(head);
        while (l!=null){
            System.out.println(l.val);
            l = l.next;
        }


    }



}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}