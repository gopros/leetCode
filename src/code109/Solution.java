package code109;


class Solution {

    public TreeNode sortedListToBST(ListNode head) {

        if (head==null) return null;
        if (head.next==null) return new TreeNode(head.val);

        ListNode fast=head,slow=head,pre=head;

        while (fast.next!=null&&fast.next.next!=null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = slow.next;
        pre.next = null;

        TreeNode root = new TreeNode(slow.val);
        if (head!=slow) root.left = sortedListToBST(head);
        root.right = sortedListToBST(fast);
        return root;



    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}


class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 TreeNode(int x) { val = x; }
}
