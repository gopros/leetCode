package code552;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public int checkRecord(int n) {

        List<String> list = new ArrayList<>();
        String[] alb = {"A","L","P"};
        DFS(n,list,alb,new StringBuilder(""));

        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)=='A'){
                    count++;
                }
            }

            if (s.contains("LLL")||count>1){
                continue;
            }

            res++;
        }

        return res;


    }

    public void DFS(int n, List<String> list,String[] alb,StringBuilder curr){

        if (curr.length()==n){
            String s = new String();
            s = curr.toString();
            list.add(s);
            return;

        }

        for (int i = 0; i < 3; i++) {
            curr.append(alb[i]);
            DFS(n,list,alb,curr);
            curr.deleteCharAt(curr.length()-1);
        }


    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.checkRecord(13));


    }



}
