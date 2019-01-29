package code93;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> list = new ArrayList<>();
        if (s.length()<4||s.length()>12) return list;
        String out = "";
        DFS(s,4,list,out);

        return list;
    }

    public void DFS(String s,int k,List<String> list,String out){
        if (k==0){
            if (s.isEmpty()) {
                list.add(out);
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (s.length()>=i&&valid(s.substring(0,i))){
                if (k==1) DFS(s.substring(i),k-1,list,out+s.substring(0,i));
                else DFS(s.substring(i),k-1,list,out+s.substring(0,i)+'.');
            }
        }

    }

    public boolean valid(String s){
        if (s.isEmpty()||s.length()>3||(s.length()>1&&s.charAt(0)=='0')){
            return  false;
        }
        int n = Integer.parseInt(s);
        if (n>255||n<0) return false;
        else return true;

    }


    public static void main(String[] args) {

        Solution s = new Solution();
        List<String> list = s.restoreIpAddresses("010010");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }



}
