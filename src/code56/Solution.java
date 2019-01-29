package code56;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {

    public List<Interval> merge(List<Interval> intervals) {



        List<Interval> res = new ArrayList<>();

        if (intervals.size()==0) return res;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) return o1.start - o2.start;
                else return o1.end-o2.end;
            }
        });
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

        Interval a1 = new Interval(3,5);
        Interval a2 = new Interval(4,8);
        Interval a3 = new Interval(6,7);
        Interval a4 = new Interval(8,10);

        intervals.add(a1);
        intervals.add(a2);
        intervals.add(a3);
        intervals.add(a4);

        List<Interval> list = s.merge(intervals);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).start+" "+list.get(i).end);
        }




    }



}
