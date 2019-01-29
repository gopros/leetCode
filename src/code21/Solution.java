package code21;


class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode s = new ListNode(-1);
        ListNode t = s;

        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                t.next = l1;
                l1=l1.next;
            }else {
                t.next = l2;
                l2 = l2.next;
            }
            t = t.next;
        }

        t.next = (l1==null)?l2:l1;

        return s.next;


    }

    public static void main(String[] args) {

        Solution s = new Solution();




    }



}
