package code147;

class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head==null||head.next==null) return head;

        ListNode headN = new ListNode(0),p = head,q,pre,tmp;

        while (p!=null){
            tmp = p.next;
            p.next = null;
            q = headN.next;
            pre = headN;
            while (q!=null&&p.val>q.val){
                pre = q;
                q = q.next;
            }
            pre.next = p;
            p.next = q;
            p = tmp;

        }
        return headN.next;


    }


    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);

        s.insertionSortList(head);
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