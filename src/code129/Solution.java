package code129;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public int sumNumbers(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        PreOrder(root,list,lists);
        int sum = 0;
        for (int i = 0; i < lists.size(); i++) {
            int n = 1;
            for (int j = 0; j < lists.get(i).size(); j++) {
                sum+=n*lists.get(i).get(j);
                n=n*10;
            }
        }


        return sum;

    }

    void PreOrder(TreeNode root,List<Integer> list,List<List<Integer>> lists){

        if (root==null) return;

        if (root.left==null&&root.right==null){
            list.add(0,root.val);
            List<Integer> newL = new ArrayList<>();
            newL.addAll(list);
            lists.add(newL);
            list.remove(0);
            return;
        }

        list.add(0,root.val);
        if (root.left!=null) PreOrder(root.left,list,lists);
        if (root.right!=null) PreOrder(root.right,list,lists);
        list.remove(0);

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