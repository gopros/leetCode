package code106;


import java.util.Arrays;

class Solution {

    public TreeNode buildTree( int[] inorder,int[] postorder) {

        if (postorder.length==0) return null;

        int rootVal = postorder[postorder.length-1];

        TreeNode root = new TreeNode(rootVal);

        if (postorder.length==1) return root;

        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i]==rootVal){
                index = i;
                break;
            }
        }

        if (index==0){
            root.left = null;
            root.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));
        }else if (index==inorder.length-1){
            root.right = null;
            root.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        }else {
            root.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
            root.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));
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