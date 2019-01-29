package code402;


import java.util.Arrays;
import java.util.Stack;

class Solution {

    public String removeKdigits(String num, int k) {

        if (num.length()==k) return "0";

        StringBuilder stringBuilder = new StringBuilder(num);

        String re = "";
        int s=0,keep = num.length()-k,count=0;

        while (true){
            int t = keep-count;
            if (t==stringBuilder.length()){
                for (int i = 0; i < stringBuilder.length(); i++) {
                    re+=stringBuilder.charAt(i);
                }
                break;
            }

            String a = stringBuilder.substring(0,stringBuilder.length()-t+1);
            int min = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)<a.charAt(min)){
                    min = i;
                }
            }
            re+=stringBuilder.charAt(min);
            stringBuilder.delete(0,min+1);

            count++;
            if (re.length()==keep){
                break;
            }

        }
        int i=0;
        for (i = 0; i < re.length(); i++) {
            if (re.charAt(i)!='0'){
                break;
            }
        }
        String r = re.substring(i);
        if (r.length()==0) return "0";



        return r;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.removeKdigits("10",1));

    }



}
