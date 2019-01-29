package code108;


import java.util.Arrays;

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length==0) return null;

        if (nums.length==3){
            TreeNode root = new TreeNode(nums[1]);
            root.left = new TreeNode(nums[0]);
            root.right = new TreeNode(nums[2]);
            return root;
        }else if (nums.length==2){

            TreeNode root = new TreeNode(nums[1]);
            root.left = new TreeNode(nums[0]);
            return root;

        }else if (nums.length==1){
            return new TreeNode(nums[0]);
        }else {

            int rootVal = nums[nums.length/2];
            TreeNode root = new TreeNode(rootVal);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
            return root;
        }

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