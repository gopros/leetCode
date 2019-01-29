package code49;


import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs){

        List<List<String>> lists = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            if(!map.containsKey(b)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(b,list);
            }else {
                map.get(b).add(strs[i]);
            }
        }

        for (List<String> list:map.values()){
            lists.add(list);
        }


        return lists;


    }

    public static void main(String[] args) {

        Solution s = new Solution();

        String[] ss = {"eat","ate","nat","tan","bat"};

        s.groupAnagrams(ss);

    }



}
