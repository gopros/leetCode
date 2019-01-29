package code141;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        ListNode p = head;

        while (p!=null){
            if (set.contains(p)){
                return true;
            }else {
                set.add(p);
            }
            p=p.next;
        }
        return false;


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