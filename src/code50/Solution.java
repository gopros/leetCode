package code50;


class Solution {

    public double myPow(double x, int n) {

        if (x==1) return 1;

        if (n<0){
            double a = Pow(x,-n);

            return 0;
        }else {
            return Pow(x,n);
        }





    }

    public double Pow(double x ,int n){
        if (n==1) return x;
        if (n==0) return 1;

        double half = Pow(x,n/2);

        if (n%2==0){
            return half*half;
        }else {
            return half*half*x;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();


        s.myPow(2.00000 ,-2147483648);

//        System.out.println(1/Double.POSITIVE_INFINITY);



    }



}
