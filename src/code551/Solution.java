package code551;


class Solution {

    public boolean checkRecord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='A'){
                count++;
            }
        }

        if (s.contains("LLL")||count>1){
            return false;
        }

        return true;

    }




    public static void main(String[] args) {

        Solution s = new Solution();

        s.checkRecord("PPALLP");


    }



}
