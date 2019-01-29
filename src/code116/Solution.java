package code116;


class Solution {


    public void connect(TreeLinkNode root) {

        if (root.left==null||root.right==null) return;

        root.left.next = root.right;

        if (root.next!=null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);

    }


    public static void main(String[] args) {

        Solution s = new Solution();


    }



}

class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
 }