package code435;


import java.util.*;

class Solution {

    public int eraseOverlapIntervals(Interval[] intervals) {

        if (intervals.length==0) return 0;

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start>o2.start){
                    return 1;
                }else if (o1.start==o2.start){
                    if (o1.end>o2.end){
                        return 1;
                    }else {
                        return -1;
                    }
                }else {
                    return -1;
                }
            }
        });

        int last = 0,res = 0;
        for (int i = 1; i < intervals.length; i++) {
//            System.out.println(intervals[i].start+" "+intervals[i].end);
            if (intervals[i].start > intervals[last].end){
                last = i;
            }else {
                res++;
                if (intervals[i].end<intervals[last].end) last = i;
            }
        }


        return res;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        Interval a1 = new Interval(1,2);
        Interval a2 = new Interval(1,3);
        Interval a3 = new Interval(3,4);
        Interval a4 = new Interval(1,3);

        Interval[] b = new Interval[]{a1,a2,a3,a4};

        System.out.println(s.eraseOverlapIntervals(b));

    }



}
