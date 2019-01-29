package code52;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public int totalNQueens(int n) {
        List<Integer> count = new ArrayList<>();
        count.add(0);
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder("");
            for (int j = 0; j < n; j++) {
                string.append(".");
            }
            list.add(string);
        }

        DFS(count,list,0);

        return count.get(0);
    }

    public boolean DFS(List<Integer> count, List<StringBuilder> current, int i){

        if (i==current.size()){
            count.set(0,count.get(0)+1);
            return true;
        }


        if (i<current.size()){
            for (int j = 0; j < current.size(); j++) {

                current.get(i).setCharAt(j,'Q');

                if (isValid(current,i,j)){
                    DFS(count,current,i+1);
                }

                current.get(i).setCharAt(j,'.');

            }

        }
        return false;


    }

    public boolean isValid(List<StringBuilder> list,int i,int j){

        for (int k = 0; k < list.size(); k++) {
            if (k!=i&&list.get(k).charAt(j)=='Q'){
                return false;
            }
        }
        for (int k = 0; k < list.size(); k++) {
            if (k!=j&&list.get(i).charAt(k)=='Q'){
                return false;
            }
        }

        for (int k = 0,l = j-i; k <list.size()&&l<list.size() ; k++,l++) {
            if (l>=0&&k!=i&&l!=j&&list.get(k).charAt(l)=='Q'){
                return false;
            }
        }

        for (int k = 0,l = j+i; k <list.size()&&l>=0 ; k++,l--) {
            if (l<list.size()&&k!=i&&l!=j&&list.get(k).charAt(l)=='Q'){
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.totalNQueens(4));


    }



}
