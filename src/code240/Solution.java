package code240;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {


    public boolean searchMatrix(int[][] matrix, int target) {
        int[][] flag = new int[matrix.length][matrix[0].length];
        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        flag[0][0] = 1;
        stack.push(list);

        while (!stack.empty()){
            List<Integer> t = stack.pop();
            if (matrix[t.get(0)][t.get(1)]==target) return true;
            if (matrix[t.get(0)][t.get(1)]<target){
                List<Integer> a = new ArrayList<>();
                a.add(t.get(0)+1);
                a.add(t.get(1));

                List<Integer> b = new ArrayList<>();
                b.add(t.get(0));
                b.add(t.get(1)+1);

                if (a.get(0)<matrix.length&&flag[t.get(0)+1][t.get(1)]==0){
                    stack.push(a);
                    flag[t.get(0)+1][t.get(1)] = 1;
                }
                if (b.get(1)<matrix[0].length&&flag[t.get(0)][t.get(1)+1] == 0){
                    stack.push(b);
                    flag[t.get(0)][t.get(1)+1] = 1;
                }


            }
        }

        return false;


    }

    public boolean searchMatrix2(int[][] matrix, int target){

        if(matrix.length==0) return false;
        if(matrix[0].length==0) return false;
        int i = matrix.length-1,j=0;
        while (i>=0&&j<=matrix[0].length-1){
            if (matrix[i][j]==target) return true;
            else if (matrix[i][j]>target){
                i--;
            }else {
                j++;
            }
        }

        return false;

    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int[][] a = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        System.out.println(s.searchMatrix2(a,20));


    }



}
