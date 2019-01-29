package code39;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        DFS(candidates,target,lists,list,0);

        return lists;

    }

    public void DFS(int[] candidates,int target,List<List<Integer>> res,List<Integer> list,int start){


        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum+=list.get(j);
            }
            if (sum==target){
                List<Integer> list1 = new ArrayList<>();
                list1.addAll(list);
                res.add(list1);
            }else if(sum<target){
                DFS(candidates,target,res,list,i);
            }
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {2,3,6,7};
        List<List<Integer>> lists = s.combinationSum(a,7);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }


    }



}
