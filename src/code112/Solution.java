package code112;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        List<Integer> list = new ArrayList<>();
        return  DFS(root,list,sum);
    }


    public boolean DFS(TreeNode root, List<Integer> list,int sum){

        if (root.left==null&&root.right==null){
            list.add(root.val);
            if(sum==list.stream().mapToInt(Integer::new).sum()){
                return true;
            }else {
                list.remove(list.size()-1);
            }
        }

        list.add(root.val);
        if (root.left!=null) {
            if (DFS(root.left,list,sum)) return true;
        }
        if (root.right!=null){
            if (DFS(root.right,list,sum)) return true;
        }
        list.remove(list.size()-1);
        return false;


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
