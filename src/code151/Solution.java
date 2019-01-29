package code151;


import java.util.Stack;

class Solution {

    public String reverseWords(String s) {

        Stack<String> stack = new Stack<>();
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                if (!temp.isEmpty()){
                    stack.push(temp);
                    temp = "";
                }
            }else {
                temp = temp + s.charAt(i);
            }
        }

        if (!temp.isEmpty()){
            stack.push(temp);
        }
        if (stack.empty()) return "";
        String res = ""+stack.pop();
        while (!stack.empty()){
            res = res + " " +stack.pop();
        }

        return res;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println((s.reverseWords("")));

    }



}
