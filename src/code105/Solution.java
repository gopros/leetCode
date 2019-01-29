package code105;


import java.util.Arrays;

class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {



        int rootVal = preorder[0];

        TreeNode root = new TreeNode(rootVal);

        if (preorder.length==1) return root;

        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i]==rootVal){
                index = i;
                break;
            }
        }

        if (index==0){
            root.left = null;
            root.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        }else if (index==inorder.length-1){
            root.right = null;
            root.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        }else {
            root.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
            root.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        }



        return root;



    }

    public static void main(String[] args) {

        Solution s = new Solution();

        TreeNode root = s.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});

        System.out.println(root.val);

//        int[] a = new int[]{1,2,3,4};
//        System.out.println(Arrays.toString(Arrays.copyOfRange(a,0,0)));
    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}