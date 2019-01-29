package code44;


class Solution {

    public boolean isMatch(String s, String p) {

        return DFS(s,p,0,0);
    }

    public boolean DFS(String s,String p,int i,int j){

        if (i==s.length()&&j==p.length()){
            return true;
        }

        if (i>=s.length()||j>=p.length()){
                if (s.length()==i&&j<p.length()&&p.charAt(j)=='*'){
                    while (++j<p.length()&&p.charAt(j)=='*');

                    if (j==p.length()) return true;

                }
                return false;
        }


        if (s.charAt(i)!=p.charAt(j)){
            if (p.charAt(j)=='?'){
                return DFS(s,p,i+1,j+1);

            }else if (p.charAt(j)=='*'){
                for (int k = 0; k+i <= s.length(); k++) {
                    if(DFS(s,p,i+k,j+1)) return true;
                }
                return false;
            }else {
                return false;
            }
        }else {
            return DFS(s,p,i+1,j+1);
        }


    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.isMatch("abaaaaaaaaaaaaaaab","a*********a*"));


    }



}
