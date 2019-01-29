package code120;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {


        if(triangle.size()==0) return 0;
        return  findMin(triangle,0,0);

    }

    public int findMin(List<List<Integer>> triangle,int i,int l){


        if (l==triangle.size()-1){
            return triangle.get(l).get(i);
        }
        int c = triangle.get(l).get(i);
        return  Math.min(c+findMin(triangle,i,l+1),c+findMin(triangle,i+1,l+1));

    }

    public int minimumTotal2(List<List<Integer>> triangle){

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j==0){
                    triangle.get(i).set(j,triangle.get(i-1).get(j)+triangle.get(i).get(j));
                }else if(j==triangle.get(i).size()-1){
                    triangle.get(i).set(j,triangle.get(i-1).get(j-1)+triangle.get(i).get(j));
                } else {
                    int temp = Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1));
                    triangle.get(i).set(j,temp+triangle.get(i).get(j));
                }
            }

        }



        return Collections.min(triangle.get(triangle.size()-1));
    }


    public static void main(String[] args) {

        Solution s = new Solution();

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4 = new ArrayList<>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);

        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        lists.add(l4);

        System.out.println(s.minimumTotal2(lists));




    }



}
