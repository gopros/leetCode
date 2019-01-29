package code392;


class Solution {

    public boolean isSubsequence(String s, String t) {

        int a = 0;
        for (int i = 0,j=0; i < t.length()&&j<s.length(); i++) {
            if (t.charAt(i)==s.charAt(j)){
                j++;
                a= j;
            }
        }

        if (a==s.length()){
            return true;
        }else {
            return false;
        }




    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.isSubsequence("abc","ahagdc"));

    }



}
