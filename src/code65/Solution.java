package code65;


import java.util.Arrays;

class Solution {

    public boolean isNumber(String s) {

        s = s.trim();
        String[] strings = s.split("\\.");
        if (strings.length==1){
            strings = s.split("e");
        }
        if (strings.length>2) return false;

        if (strings.length==1){
            for (int i = 0; i < strings[0].length(); i++) {
                if(strings[0].charAt(i)<'0'||strings[0].charAt(i)>'9'){
                    return false;
                }
            }
        }else {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length(); j++) {
                    if(strings[i].charAt(i)<'0'||strings[i].charAt(i)>'9'){
                        return false;
                    }
                }

            }

        }



        return true;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        String str = "e10";
        System.out.println(str.split("a").length);

    }



}
