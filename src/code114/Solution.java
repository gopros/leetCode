package code114;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public void flatten(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();

        if (root==null) return;

        preOrder(root,list);

        for (int i = 0; i < list.size()-1; i++) {
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
        list.get(list.size()-1).left = null;
        list.get(list.size()-1).right = null;

    }

    public void preOrder(TreeNode node , List<TreeNode> list){

        if (node==null) return;

        list.add(node);
        preOrder(node.left,list);
        preOrder(node.right,list);


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
