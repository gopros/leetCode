package code60;


import java.util.ArrayList;
import java.util.List;

class Solution {

    public String getPermutation(int n, int k) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        int[] visited = new int[n+1];
        DFS(n,k,list,s,visited);

        return list.get(k-1);

    }

    public boolean DFS(int n, int k, List<String> list,StringBuilder s,int[] visited){

        if (s.length()==n){
            if (list.size()==k-1){
                list.add(s.toString());
                return false;
            }
            list.add(s.toString());
            return true;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i]==0){
                visited[i] = 1;
                s.append(i);
                if(!DFS(n,k,list,s,visited)) return false;
                s.deleteCharAt(s.length()-1);
                visited[i] = 0;
            }


        }
        return true;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.getPermutation(4,9));
//        System.out.println(new StringBuilder().append(1).toString());

    }



}
