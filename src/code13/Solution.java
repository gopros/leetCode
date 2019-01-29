package code13;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i)=='I'||s.charAt(i)=='X'||s.charAt(i)=='C')&&(i+1)<s.length()){
                if (map.get(s.charAt(i+1))>map.get(s.charAt(i))){
                    sum = sum + map.get(s.charAt(i+1))-map.get(s.charAt(i));
                    i++;
                    continue;
                }
            }

            sum = sum + map.get(s.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}
