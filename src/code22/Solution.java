package code22;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        helper(n,n,"",list);

        return list;

    }

    public void helper(int left,int right,String out,List list){

        if (left>right||left<0||right<0) return;

        if (left==0&&right==0) list.add(out);

        helper(left-1,right,out+"(",list);
        helper(left,right-1,out+")",list);

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        s.generateParenthesis(3);


    }



}
