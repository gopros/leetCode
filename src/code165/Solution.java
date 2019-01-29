package code165;


class Solution {


    public int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");
        int i;
        for (i = 0; i < strings1.length&&i<strings2.length; i++) {
            if (Integer.parseInt(strings1[i])>Integer.parseInt(strings2[i])){
                return 1;
            }else if (Integer.parseInt(strings1[i])<Integer.parseInt(strings2[i])){
                return -1;
            }
        }
        if (strings1.length>strings2.length){

            for (; i < strings1.length; i++) {
                if (Integer.parseInt(strings1[i])!=0){
                    return 1;
                }
            }
            return 0;

        }else if (strings1.length<strings2.length){
            for (; i < strings2.length; i++) {
                if (Integer.parseInt(strings2[i])!=0){
                    return -1;
                }
            }
            return 0;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.compareVersion("0.1","1.1"));

    }



}
