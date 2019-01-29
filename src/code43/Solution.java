package code43;


import java.util.Arrays;

class Solution {

    public String multiply(String num1, String num2) {

        String re = "";
        int t = 0;
        int[] sum = new int[110];

        if (num1.length()<num2.length()){
            String a = num1;
            num1 = num2;
            num2 = a;
        }

        int k=0;
        for (int i = num2.length()-1; i >= 0; i--) {
            int[] s = new int[110];
            int x=0;
            t=0;
            for (int j = num1.length()-1; j >= 0; j--) {
                int a = num2.charAt(i)-'0',b = num1.charAt(j)-'0';

                int tmp = a*b;

                s[x] = (tmp%10+t)%10;

                t = tmp/10+(tmp%10+t)/10;
                x++;

            }
            s[x] = t;
            int a = 0;
            for (int j = k; j < sum.length; j++) {
                int b = (s[j-k]+sum[j]+a)%10;
                a = (s[j-k]+sum[j]+a)/10;
                sum[j] = b;
            }
            k++;


        }

        int flag = 0;

        for (int i = sum.length-1; i >=0; i--) {
            if (sum[i]!=0||flag==1){
                flag = 1;
                re=re+Character.toChars('0'+sum[i])[0];
            }
        }

        if (re.length()==0) re = "0";


        return re;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.multiply("77777","77777"));
//        System.out.println(""+'a'+'2');


    }



}
