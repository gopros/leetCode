package code131;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<String>> partition(String s) {
        List<String> str = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        DFS(s,str,lists);

        return lists;


    }

    void DFS(String s,List<String> str, List<List<String>> lists){


        if (s.length()==0){
            List<String> list = new ArrayList<>();
            list.addAll(str);
            lists.add(list);
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String a = s.substring(0,i);
            if (!isStr(a)) continue;
            str.add(a);
            String b = s.substring(i);
            DFS(b,str,lists);
            str.remove(str.size()-1);

        }


    }

    boolean isStr(String s){

        if (s.length()==1) return true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        s.partition("aab");

    }



}
