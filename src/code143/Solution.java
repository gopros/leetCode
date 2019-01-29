package code143;


import java.util.Stack;

class Solution {

    public void reorderList(ListNode head) {

        if (head==null||head.next==null) return;

        ListNode f = head;
        ListNode s = head;

        while (s.next!=null&&s.next.next!=null){
            f = f.next;
            s = s.next.next;
        }
        ListNode p = f.next;
        f.next = null;

        ListNode headN = new ListNode(0),tmp=null,next = null;

        while (p!=null){
            tmp = headN.next;
            next = p.next;
            headN.next = p;
            p.next = tmp;
            p = next;
        }

        p = headN.next;
        f= head;

        while (f!=null&&p!=null){
            next = f.next;
            f.next = p;
            tmp = p.next;
            p.next = next;
            f = next;
            p = tmp;
        }

        System.out.println();



    }



    public void reorderList2(ListNode head) {

        if (head==null||head.next==null||head.next.next==null) return;

        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p!=null){
            stack.push(p);
            p=p.next;

        }
        p=head;
        ListNode q = stack.pop(),tmp = null;
        while (p!=null&&!stack.empty()){
            tmp = p.next;
            p.next = q;
            q.next = tmp;
            p = tmp;
            q = stack.pop();
            if(q==p||p.next==q){
                q.next = null;
                break;
            }

        }
        System.out.println();


    }

    public static void main(String[] args) {

        Solution s = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        s.reorderList2(head);


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