package code57;



import sun.awt.util.IdentityArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        int l = intervals.size();

        for (int i = 0; i < intervals.size(); i++) {
            if (intervals.get(i).start>=newInterval.start){
                intervals.add(i,newInterval);
                break;
            }
        }

        if (l==intervals.size()) intervals.add(newInterval);


        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).start+" "+intervals.get(i).end);
        }

        List<Interval> res = new ArrayList<>();

        res.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start<=res.get(res.size()-1).end){
                res.set(res.size()-1,new Interval(res.get(res.size()-1).start,Math.max(intervals.get(i).end,res.get(res.size()-1).end)));
            }else {
                res.add(intervals.get(i));
            }
        }

        return res;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        List<Interval> intervals = new ArrayList<>();

        Interval a1 = new Interval(1,5);
        Interval a2 = new Interval(4,8);
        Interval a3 = new Interval(2,7);

        intervals.add(a1);



        List<Interval> list = s.insert(intervals,a3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).start+" "+list.get(i).end);
        }




    }



}
