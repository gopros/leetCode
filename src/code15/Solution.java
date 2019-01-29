package code15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> li = new ArrayList<>();

        Arrays.sort(nums);

        int tmp = 0;
        for (int i = 0; i < nums.length-2; i++) {

            if (nums[i]>0){
                break;
            }

            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while (j<k){
                if (nums[i]+nums[j]+nums[k]==0){
                    List l = new ArrayList();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    li.add(l);
                    while (j<k && nums[j]==nums[j+1]) j++;
                    while (j<k && nums[k-1]==nums[k]) k--;
                    j++;
                    k--;
                }else if (nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else {
                    j++;
                }
            }






        }

        return li;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a = {-2,-1,0,1,2,3};

        List<List<Integer>> b = s.threeSum(a);

        Iterator<List<Integer>> iterator = b.iterator();

        while (iterator.hasNext()) {
            List<Integer> c = iterator.next();
            System.out.println(Arrays.toString(c.toArray()));
//            Iterator iterator1 = c.iterator();
//            while (iterator1.hasNext()) {
//                System.out.println(iterator1.next());
//            }
        }
    }

}
