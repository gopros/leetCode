package code20;

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        if (s.length()==0) return true;

        Stack<Character> st = new Stack<>();

        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                st.push(s.charAt(i));
                flag = 1;
            }else if (s.charAt(i)=='}'){
                if (!st.empty()){
                    if (st.peek()=='{'){
                        st.pop();
                    }else {
                        flag = 0;
                        break;
                    }
                }else {
                    flag = 0;
                    break;
                }

            }else if (s.charAt(i)==']'){
                if (!st.empty()){
                    if (st.peek()=='['){
                        st.pop();
                    }else {
                        flag = 0;
                        break;
                    }
                }else {
                    flag = 0;
                    break;
                }
            }else if (s.charAt(i)==')'){
                if (!st.empty()){
                    if (st.peek()=='('){
                        st.pop();
                    }else {
                        flag = 0;
                        break;
                    }
                }else {
                    flag = 0;
                    break;
                }
            }
        }

        if (st.size()!=0||flag==0){
            return false;
        }else return true;


    }


    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.isValid("()}"));


    }



}
