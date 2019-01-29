package code29;


class Solution {

    public int divide(int dividend, int divisor) {

        if (dividend==0) {
            return 0;
        }

        int flag = 0,re = 0;
        if (dividend>0&&divisor>0||dividend<0&&divisor<0){
            flag = 1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend>0){
            dividend = dividend - divisor;
            if (dividend>0){
                re++;
            }

        }
        if (1==flag){
            return re;
        }

        return -re;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.divide(-7,3));

    }



}
