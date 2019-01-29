package code24;


class Solution {

    public ListNode swapPairs(ListNode head) {

        if(head==null) return null;
        if (head.next==null) return head;

        ListNode s = new ListNode(-1),p = head;
        ListNode t = s,pre = null,tmp = null;

        while (p.next!=null){
            pre = p;
            p = p.next;

            tmp = p.next;
            t.next = p;
            p.next = pre;
            pre.next = tmp;
            p = tmp;

            if (p==null){
                break;
            }
            t = t.next.next;


        }
        return s.next;


    }

    public static void main(String[] args) {

        Solution s = new Solution();




    }



}
