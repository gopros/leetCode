package code14;

import java.util.Vector;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String sub = "";

        if (strs.length == 0 || strs==null) return sub;

        int count=0;
        int flag = 1;
        int min = 1000;
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()){
                min = strs[i].length();
            }
        }

        while(true) {

            if (count>min-1){
                break;
            }


            Character spre = strs[0].charAt(count);
            for (int i = 1; i <strs.length ; i++) {
                Character stemp = strs[i].charAt(count);
                if (stemp==spre){
                    spre = stemp;
                }else {
                    flag = 0;
                    break;
                }
            }

            if (flag==0){
                break;
            }else {
                sub = sub + spre;
            }

            count++;

        }

        return sub;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        String[] strs = {"apple","apple","apple"};


        System.out.println(s.longestCommonPrefix(strs));

    }
}
