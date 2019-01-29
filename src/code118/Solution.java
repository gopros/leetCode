package code118;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 1; i <=numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j-1>=1&&j<i){
                    int a = lists.get(i-2).get(j-2)+lists.get(i-2).get(j-1);
                    list.add(a);
                }else {
                    list.add(1);
                }
            }
            lists.add(list);
        }

        return lists;

    }
    public static void main(String[] args) {

        Solution s = new Solution();
        s.generate(2);


    }



}
