package code99;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public void recoverTree(TreeNode root) {

        if (root==null) return;

        List<Integer> list = new ArrayList<>();
        List<TreeNode> treeList = new ArrayList<>();
        minOrder(root,list,treeList);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            treeList.get(i).val = list.get(i);
        }




    }

    public void minOrder(TreeNode treeNode,List<Integer> list,List<TreeNode> treeList){

        if (treeNode==null) return;

        minOrder(treeNode.left,list,treeList);
        list.add(treeNode.val);
        treeList.add(treeNode);
        minOrder(treeNode.right,list,treeList);

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