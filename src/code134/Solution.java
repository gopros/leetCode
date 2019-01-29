package code134;


class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sum = 0,t=0,total= 0,k=0;
        for (int i = 0; i< gas.length;i++) {

            sum += gas[i];
            total = total + gas[i] - cost[i];

            if (cost[i]>sum){
                sum=0;
                t = i+1;

            }else {
                sum = sum-cost[i];
            }

        }

        if (total>=0){
            return t;
        }else {
            return -1;
        }




    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] gas = {3,3,4};
        int[] cost = {4,3,3};
        System.out.println(s.canCompleteCircuit(gas,cost));


    }



}
