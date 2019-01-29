package code77;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        DFS(n,k,1,out,lists);

        return lists;

    }

    public void DFS(int n, int k,int level ,List<Integer> out ,List<List<Integer>> lists){

        if (out.size()==k){

            List<Integer> list = new ArrayList<>();

            list.addAll(out);

            lists.add(list);
        }else {
            for (int i = level; i <= n; i++) {

                out.add(i);
                DFS(n,k,i+1,out,lists);
                out.remove(out.size()-1);


            }
        }



    }

    public static void main(String[] args) {

        Solution s = new Solution();

        List<List<Integer>> lists = s.combine(4,2);

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }


    }



}
