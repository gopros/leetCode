package code11;


class Solution {

    public int maxArea(int[] height) {

        if (height.length<2){
            return 0;
        }

        int maxA = 0;

        for (int i = 0; i < height.length; i++) {
            int m = maxAreaFixed(height,i);
            if(maxA<m){
                maxA = m;
            }
        }
        return maxA;


    }

    public int maxAreaFixed(int[] height,int start){

        if (height.length-start<2){
            return 0;
        }
        int maxA = 0;
        for (int i = start+1; i < height.length; i++) {
            int h = Math.min(height[start],height[i]);
            int w = i - start;
            if (maxA<h*w){
                maxA = h*w;
            }
        }

        return maxA;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] a = {1,1};
        System.out.println(s.maxArea(a));


    }



}
