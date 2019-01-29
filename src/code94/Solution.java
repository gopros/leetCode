package code94;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);
        return list;

    }
    public void inOrder(TreeNode root,List<Integer> list){
        if (root==null) return;

        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);

    }

    public static void main(String[] args) {

        Solution s = new Solution();


    }



}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }