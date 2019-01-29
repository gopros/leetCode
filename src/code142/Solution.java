package code142;


import java.util.HashSet;
import java.util.Set;

class Solution {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode p = head;

        while (p!=null){
            if (set.contains(p)){
                return p;
            }else {
                set.add(p);
            }
            p=p.next;
        }

        return null;
    }

    public static void main(String[] args) {

        Solution s = new Solution();


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