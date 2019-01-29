package code174;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public int calculateMinimumHP(int[][] dungeon) {


        if (dungeon.length==0||dungeon[0].length==0){
            return 0;
        }

        List<Integer> res = new ArrayList<>();

        DFS(dungeon,res,0,0,0,0);

        Collections.sort(res);


        return res.get(res.size()-1)>0?0:-res.get(res.size()-1)+1;

    }

    void DFS(int[][] dungeon, List<Integer> res,int i,int j,int sum,int min){

        if (i==dungeon.length-1&&j==dungeon[0].length-1){
            min = Math.min(min,dungeon[i][j]+sum);
            res.add(min);
            return;
        }

        if (j+1<dungeon[0].length){

            min = Math.min(min,dungeon[i][j]+sum);

            DFS(dungeon,res,i,j+1,sum+dungeon[i][j],min);
        }

        if (i+1<dungeon.length){
            min = Math.min(min,dungeon[i][j]+sum);
            DFS(dungeon,res,i+1,j,sum+dungeon[i][j],min);
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[][] a = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(s.calculateMinimumHP(a));


    }



}
