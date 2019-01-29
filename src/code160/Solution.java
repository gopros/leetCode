package code160;


class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int n1=0,n2=0,sub=0;
        ListNode p = headA,q = headB;
        while (p!=null){
            n1++;
            p=p.next;
        }
        while (q!=null){
            n2++;
            q=q.next;
        }

        if (n1>n2){
            sub = n1-n2;
            while (sub>0){
                headA = headA.next;
                sub--;
            }
        }else if (n2>n1){
            sub = n2-n1;
            while (sub>0){
                headB = headB.next;
                sub--;
            }
        }

        p = headA;
        q = headB;

        while (p!=null&&q!=null){
            if (p.equals(q)){
                return q;
            }
            p = p.next;
            q = q.next;
        }

        return null;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        ListNode headA = new  ListNode(1);
        ListNode headB = new  ListNode(3);
        ListNode q = new ListNode(2);
        headB.next = q;
        ListNode p = new ListNode(7);
        p.next = new ListNode(8);
        p.next.next = new ListNode(4);
        headA.next = p;
        q.next = p;
        System.out.println(s.getIntersectionNode(headA,headB).val);



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