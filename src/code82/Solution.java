package code82;


class Solution {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = new ListNode(0);
        ListNode p = head,q = h;
        int flag = 0;
        if (p==null) return null;
        while (p.next!=null){
            if (p.val!=p.next.val){
                if (flag==0){
                    q.next = p;
                    q = p;
                }
                p = p.next;
                flag = 0;
            }else {
                p=p.next;
                flag = 1;
            }
        }

        if (flag==0){
            q.next = p;
        }else {
            q.next = null;
        }



        return h.next;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(1);
        ListNode h3 = new ListNode(1);
        h1.next = h2;
        h2.next = h3;
        h3.next = null;
        s.deleteDuplicates(h1);




    }



}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}