package code100;


class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null&&q==null){
            return true;
        }

        if (p==null||q==null){
            return false;
        }

        if (p.val==q.val){
            if (!isSameTree(p.left,q.left)||!isSameTree(p.right,q.right)){
                return false;
            }else {
                return true;
            }
        }else return false;
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