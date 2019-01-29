package code28;


class Solution {

    public int strStr(String haystack, String needle) {

        if (haystack.length()==0||needle.length()==0)
            return -1;


        int s=0,flag=0;
        int i=0,j=0;
        while(i<haystack.length()){

            while (haystack.charAt(i)==needle.charAt(j)){
                if (i==haystack.length()-1||j==needle.length()-1){
                    j++;
                    break;
                }

                i++;
                j++;
            }


            if (j==needle.length()){
                break;
            }else {
             i = s+1;
             s++;
             j=0;
            }



        }

        if (j==needle.length()){
            return s;
        }

        return -1;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.strStr("mississippi","issip"));


    }



}
