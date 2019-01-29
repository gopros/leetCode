package code98;


class Solution {


    public boolean isValidBST(TreeNode root) {

        if (root==null) return true;

        boolean l=false,r=false;
        if (root.left==null){
            l = true;
        }else if (isValidBST(root.left)){
            TreeNode left = root.left;
            while (left.right!=null){
                left = left.right;
            }
            if (root.val>left.val){
                l = true;
            }else {
                return false;
            }

        }else {
            return false;
        }

        if (root.right==null){
            r = true;
        }else if (isValidBST(root.right)){
            TreeNode right = root.right;
            while (right.left!=null){
                right = right.left;
            }
            if (root.val < right.val){
                r = true;
            }else {
                return false;
            }

        }else {
            return false;
        }

        if (l&&r){
            return true;
        }else {
            return false;
        }


    }


    public static void main(String[] args) {

        Solution s = new Solution();
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        System.out.println(s.isValidBST(treeNode));


    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}