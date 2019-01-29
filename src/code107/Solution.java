package code107;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LevelTree levelTree = new LevelTree(root,1);
        Queue<LevelTree> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();

        if (root==null) return lists;

        queue.add(levelTree);

        while (!queue.isEmpty()){
            LevelTree l = queue.poll();
            List<Integer> list;
            if (lists.size()<l.level){
                list = new ArrayList<>();
                list.add(l.node.val);
                lists.add(0,list);

            }else {
                list = lists.get(0);
                list.add(l.node.val);
            }


            if (l.node.left!=null) queue.add(new LevelTree(l.node.left,l.level+1));
            if (l.node.right!=null) queue.add(new LevelTree(l.node.right,l.level+1));


        }

        return lists;



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
class LevelTree{
    TreeNode node;
    int level;
    LevelTree(TreeNode node,int level){this.node = node;this.level=level;}
}