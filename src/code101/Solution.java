package code101;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean isSymmetric(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        lOrder(root,l);
        rOrder(root,r);

        for (int i = 0; i < l.size(); i++) {
            if (!l.get(i).equals(r.get(i))){
                return false;
            }
        }
        return true;


    }

    public void lOrder(TreeNode node,List<Integer> list){
        if (node==null) {
            list.add(0);
            return;
        }

        lOrder(node.left,list);
        lOrder(node.right,list);
        list.add(node.val);
    }

    public void rOrder(TreeNode node,List<Integer> list){
        if (node==null) {
            list.add(0);
            return;
        }

        rOrder(node.right,list);
        rOrder(node.left,list);
        list.add(node.val);
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        s.isSymmetric(null);
        System.out.println(1);


    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}