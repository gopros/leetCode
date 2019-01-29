package code40;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        DFS(candidates,target,lists,list,0);

        return lists;
    }

    public void DFS(int[] candidates,int target,List<List<Integer>> res,List<Integer> list,int level){


        for (int i = level; i < candidates.length; i++) {

            list.add(candidates[i]);
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum+=list.get(j);
            }
            if (sum==target){
                if (!res.contains(list)){
                    List<Integer> list1 = new ArrayList<>();
                    list1.addAll(list);
                    res.add(list1);
                }

            }else if(sum<target){
                DFS(candidates,target,res,list,i+1);
            }
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {10,1,2,7,6,1,5};
        List<List<Integer>> lists = s.combinationSum2(a,8);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }


    }



}
