package code95;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<TreeNode> generateTrees(int n) {



        List<TreeNode> list = new ArrayList<>();
        if (n==0) return list;
        list = DFS(1,n);
        return list;

    }

    public List<TreeNode> DFS(int start, int end){

        if (start>end){
            List<TreeNode> n = new ArrayList<>();
            TreeNode treeNode = null;
            n.add(treeNode);
            return n;
        }

        List<TreeNode> list = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            TreeNode treeNode = null;
            List<TreeNode> l = new ArrayList<>();
            List<TreeNode> r = new ArrayList<>();

            l = DFS(start,i-1);
            r = DFS(i+1,end);

            for (int j = 0; j < l.size(); j++) {
                for (int k = 0; k < r.size(); k++) {
                    treeNode = new TreeNode(i);
                    treeNode.left = l.get(j);
                    treeNode.right = r.get(k);
                    list.add(treeNode);
                }
            }

        }
        return list;



    }

    public static void main(String[] args) {

        Solution s = new Solution();
        List<TreeNode> list = s.generateTrees(0);
        System.out.println(list);

    }



}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}