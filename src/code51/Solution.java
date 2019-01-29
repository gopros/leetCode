package code51;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> lists = new ArrayList<>();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder("");
            for (int j = 0; j < n; j++) {
                string.append(".");
            }
            list.add(string);
        }

        DFS(lists,list,0);



        return lists;


    }

    public boolean DFS(List<List<String>> res,List<StringBuilder> current,int i){

        if (i==current.size()){

            List<String> list = new ArrayList<>();

            for (int j = 0; j < current.size(); j++) {
                list.add(current.get(j).toString());
            }
            res.add(list);

            return true;
        }


        if (i<current.size()){
            for (int j = 0; j < current.size(); j++) {

                current.get(i).setCharAt(j,'Q');

                if (isValid(current,i,j)){
                    DFS(res,current,i+1);
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
        List<List<String>> lists = s.solveNQueens(4);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }




    }



}
