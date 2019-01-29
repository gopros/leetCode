package code58;


class Solution {

    public int lengthOfLastWord(String s) {
        int count = 0,flag = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                flag = 1;
                count++;
            }

            if (flag==1&&s.charAt(i)==' ') break;
        }

        return count;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.lengthOfLastWord(" aa bb"));


    }



}
