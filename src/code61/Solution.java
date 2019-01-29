package code61;


class Solution {



    public ListNode rotateRight(ListNode head, int k) {

        ListNode listNode = new ListNode(-1);
        ListNode p = head,q = null;
        int count = 0;

        while (p!=null){
            count++;
            p=p.next;
        }

        if (count<k) k = k%count;
        else if (count==k) return head;

        int num = count - k;

        p = head;
        count = 0;
        while (p!=null){
            if (count==num){
                break;
            }
            count++;
            p = p.next;
        }

        q = p.next;
        p.next = null;
        p = q;

        while (p.next!=null){
            p = p.next;
        }
        p.next = head;

        return q;

    }


    public static void main(String[] args) {

        Solution s = new Solution();


    }



}
