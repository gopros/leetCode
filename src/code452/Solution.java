package code452;


import java.util.Arrays;
import java.util.Comparator;

class Solution {

    public int findMinArrowShots(int[][] points) {

        if (points.length==0) return 0;

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]<o2[0]){
                    return -1;
                }else if (o1[0]==o2[0]){
                    if (o1[1]<o2[1]){
                        return -1;
                    }else {
                        return 1;
                    }
                }else {
                    return 1;
                }

            }
        });

        int[] tmp = points[0];
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]<=tmp[1]){
                tmp = new int[]{Math.max(points[i][0], tmp[0]), Math.min(points[i][1], tmp[1])};

            }else {
                tmp = points[i];
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a1 = {2,16};
        int[] a2 = {2,8};
        int[] a3 = {1,6};
        int[] a4 = {2,12};


        int[][] b = {a1,a2,a3,a4};

        System.out.println(s.findMinArrowShots(b));


    }



}
