package code86;


class Solution {

    public ListNode partition(ListNode head, int x) {

        ListNode p = head;
        ListNode listNode = new ListNode(0),q = null,tempq = null,tempp=null;
        listNode.next = null;
        while (p!=null){
            if (p.val<x){
                q = listNode;
                while (q.next!=null){
                    if (q.next.val>=x){
                        break;
                    }
                    q = q.next;
                }
                tempp = p.next;
                tempq = q.next;
                q.next = p;
                p.next = tempq;
                p = tempp;
            }else {
                q = listNode;
                while (q.next!=null){
                    q = q.next;
                }
                tempp = p.next;
                tempq = q.next;
                q.next = p;
                p.next = tempq;
                p = tempp;
            }
        }
        return listNode.next;


    }
    public static void main(String[] args) {

        Solution s = new Solution();

        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(1);
        h1.next = h2;
        h2.next = h3;
        h3.next = null;
        s.partition(h1,3);



    }



}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}