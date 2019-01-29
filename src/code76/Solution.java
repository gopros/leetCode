package code76;


import java.util.HashMap;
import java.util.Map;

class Solution {


    public String minWindow(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i))==null){
                map.put(t.charAt(i),1);
            }else {
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }

        }

        int count = 0,left = 0,min = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))!=null){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if (map.get(s.charAt(i))>=0){
                    count++;
                }
            }

            while (count==t.length()){
                if (min>i-left+1){
                    min = i-left+1;
                    res = s.substring(left,i+1);
                }

                if (map.get(s.charAt(left))==null){
                    left++;
                }else if(map.get(s.charAt(left))+1<=0){
                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                    left++;
                }else {
                    map.put(s.charAt(left),map.get(s.charAt(left))+1);
                    count--;
                    left++;
                }
            }

        }


        return res;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.minWindow("aa","aa"));

    }



}
