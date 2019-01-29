package code92;


class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head==null||head.next==null) return head;
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(0);
        ListNode p = head,q = null,pre = null,node1 = listNode1,node2 = listNode2;
        int count = 0;

        while (p!=null){
            count++;
            if (count==m){
                while (count<=n&&p!=null){
                    if (count==m) q = p;
                    node2 = listNode2.next;
                    listNode2.next = p;
                    pre = p.next;
                    p.next = node2;
                    p = pre;
                    count++;

                }
                node1.next = listNode2.next;
                q.next = p;
                break;
            }else {
                node1.next = p;
                node1 = p;
                p=p.next;
            }
        }
        return listNode1.next;



    }

    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        h3.next = null;
        s.reverseBetween(h1,2,3);


    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}