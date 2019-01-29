package code139;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {


        HashSet<String> hashSet = new HashSet<>(wordDict);

        int[] mem = new int[s.length()+1];

        for (int i = 0; i < mem.length; i++) {
            mem[i] = -1;
        }

        mem[0] = 1;

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (mem[j]==1&& hashSet.contains(s.substring(j,i))){
                    mem[i] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < mem.length; i++) {
            System.out.println(mem[i]);
        }

        if (mem[s.length()]==1) return true;
        return false;


    }

    public boolean suppose(String s,HashSet set){

        if (s.length()==0){
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (set.contains(s.substring(0,i)) && suppose(s.substring(i,s.length()),set)){

                return true;
            }
        }
        return false;

    }

    public int suppose1(String s,int start,HashSet set,int[] mem){

        if (start>=s.length()){
            return 1;
        }

        if (mem[start]!=-1) return mem[start];

        for (int i = start+1; i <= s.length(); i++) {
            if (set.contains(s.substring(start,i)) && suppose1(s,i,set,mem)==1){
                mem[start]=1;
                return 1;
            }
        }
        mem[start]=0;
        return 0;

    }


    public static void main(String[] args) {

        Solution s = new Solution();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
//        list.add("sand");
//        list.add("and");
//        list.add("cat");
        Boolean a = s.wordBreak("leetcode",list);
        System.out.println(a);
    }



}
