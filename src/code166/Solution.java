package code166;


import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {


    public String fractionToDecimal(int numerator, int denominator) {

        Float res = Float.intBitsToFloat(Math.abs(numerator))/Float.intBitsToFloat(Math.abs(denominator));

        String re = res.toString();

        String[] ds = re.split("\\.");

        if (ds.length<2||ds[1].equals("0")){
            return ds[0];
        }
        String d = ds[1];

        int flag = 0;
        if (d.length()==7){
            flag = 1;
            for (int i = 1; i < d.length() - 1; i++) {
                if (d.charAt(i-1)!=d.charAt(i)){
                    flag = 0;
                }
            }
        }

        if (flag==1){
            String r = re.split("\\.")[0]+"."+"("+d.charAt(0)+")";
            if (numerator*denominator<0){
                return "-"+r;
            }
            return r;
        }else {
            if (numerator*denominator<0){
                return "-"+re;
            }
            return res.toString();
        }


    }

    public static void main(String[] args) {



    }



}
