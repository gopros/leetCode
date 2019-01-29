package code150;


import java.util.Stack;

class Solution {

    public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                String a = stack.pop();
                String b  = stack.pop();

                if (tokens[i].equals("+")){
                    stack.push(String.valueOf(Integer.parseInt(a)+Integer.parseInt(b)));
                }else if (tokens[i].equals("-")){
                    stack.push(String.valueOf(Integer.parseInt(a)-Integer.parseInt(b)));
                }else if (tokens[i].equals("*")){
                    stack.push(String.valueOf(Integer.parseInt(a)*Integer.parseInt(b)));
                }else if (tokens[i].equals("/")){
                    stack.push(String.valueOf(Integer.parseInt(b)/Integer.parseInt(a)));
                }


            }else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.peek());

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.evalRPN(new String[]{"0", "3", "/"}));
    }



}
