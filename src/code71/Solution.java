package code71;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    public String simplifyPath(String path) {

        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("..")&&!stack.empty()){
                stack.pop();
            }else if (!strs[i].equals("")&&!strs[i].equals(".")&&!strs[i].equals("..")){
                stack.push(strs[i]);
            }
        }

        List<String> list = new ArrayList<>(stack);

        String res = "/"+String.join("/",list);

        return res;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.simplifyPath("/a/./b/../../c/"));


    }



}
