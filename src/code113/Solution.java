package code113;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null) return null;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        DFS(root,list,sum,res);
        return res;

    }


    public void DFS(TreeNode root, List<Integer> list, int sum,List<List<Integer>> res){

        if (root.left==null&&root.right==null){
            list.add(root.val);
            if(sum==list.stream().mapToInt(Integer::new).sum()){
                List<Integer> l = new ArrayList<>();
                l.addAll(list);
                res.add(l);
            }
                list.remove(list.size()-1);

        }

        list.add(root.val);
        if (root.left!=null) {
            DFS(root.left,list,sum,res);
        }
        if (root.right!=null){
            DFS(root.right,list,sum,res);
        }
        list.remove(list.size()-1);



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
