package code12;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {

        Map<Integer,Character> map = new HashMap<Integer, Character>();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');

        String s = "";

        if (num/1000>0){
            int a = num/1000;

            for (int i = 0; i < a; i++) {
                s = s + map.get(1000);
            }

        }

        num = num%1000;

        if (num/100>0){
            int a = num/100;
            if (a>=5){
                if(a==9){
                    s = s + map.get(100)+map.get(1000);
                }else{
                    int b = a - 5;
                    s = s + map.get(500);
                    for (int i = 0; i < b; i++) {
                        s = s + map.get(100);
                    }
                }
            }else if (a==4){
                s = s + map.get(100)+map.get(500);
            }else {
                for (int i = 0; i < a; i++) {
                    s = s + map.get(100);
                }
            }

        }

        num = num%100;

        if (num/10>0){
            int a = num/10;
            if (a>=5){
                if(a==9){
                    s = s + map.get(10)+map.get(100);
                }else{
                    int b = a - 5;
                    s = s + map.get(50);
                    for (int i = 0; i < b; i++) {
                        s = s + map.get(10);
                    }
                }
            }else if (a==4){
                s = s + map.get(10)+map.get(50);
            }else {
                for (int i = 0; i < a; i++) {
                    s = s + map.get(10);
                }
            }

        }
        num = num%10;
        int a = num;
        if (a>=5){
            if(a==9){
                s = s + map.get(1)+map.get(10);
            }else{
                int b = a - 5;
                s = s + map.get(5);
                for (int i = 0; i < b; i++) {
                    s = s + map.get(1);
                }
            }
        }else if (a==4){
            s = s + map.get(1)+map.get(5);
        }else {
            for (int i = 0; i < a; i++) {
                s = s + map.get(1);
            }
        }


        return s;
    }


    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.intToRoman(58));

    }



}
