package code32;


import java.util.ArrayList;
import java.util.List;

class Solution {


    public int longestValidParentheses(String s) {

        int[] dp = new int[s.length()];

        int num = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i==0){
                if (s.charAt(0)==')') dp[0] = 1;
                else dp[0] = -1;
                continue;
            }

            if (s.charAt(i)==')'){
                if (s.charAt(i-1)=='('){
                    dp[i-1]=dp[i]=0;
                }else {
                    dp[i] = 1;
                }
            }else {
                dp[i] = -1;
            }
        }

        for (int i = 1; i < s.length(); i++) {
            if (dp[i]==1){
                for (int j = i-1; j >=0; j--) {
                    if (dp[j]==-1){
                        dp[i]=dp[j]=0;
                        break;
                    }
                }
            }
        }

        int max = 0;
        int t = 0;
        for (int i = 0; i < s.length(); i++){
            if (dp[i]==0){
                t++;
            }else {
                if (t>max){
                    max = t;
                }
                t=0;
            }
        }

        if (t>max){
            max = t;
        }






        return max;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.longestValidParentheses("((()))())"));


    }



}
