package code17;

import java.util.*;

public class Solution {

    public List<String> letterCombinations(String digits) {

        Map<Character,String> map = new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        if (digits.length()<=0){
            return null;
        }

        List<String> maxtri = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        List<Integer> lsCopy = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String s = map.get(digits.charAt(i));
            maxtri.add(s);
            ls.add(s.length()-1);
            lsCopy.add(s.length()-1);
        }




        List<List<Integer>> maxtriFlag = new ArrayList<>();

        for (int i = ls.size()-1;;) {

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < ls.size(); j++) {
                list.add(ls.get(j));
            }

            maxtriFlag.add(list);


            if (ls.get(i)>0){
                ls.set(i,ls.get(i)-1);
            }else if (ls.get(i)==0){
                int tmp = i-1;
                if (tmp<0){
                    break;
                }
                while (ls.get(tmp)==0&&tmp>0){
                    tmp--;
                }

                if (tmp==0&&ls.get(tmp)==0){
                    break;
                }


                ls.set(tmp,ls.get(tmp)-1);
                for (int j = tmp+1; j <ls.size() ; j++) {
                    ls.set(j,lsCopy.get(j));
                }


            }
        }


        List<String> re = new ArrayList<>();

        for (int i = 0; i < maxtriFlag.size(); i++) {
            List<Integer> tmpList = maxtriFlag.get(i);
            String a = "";
            for (int j = 0; j < maxtri.size(); j++) {
                a = a + maxtri.get(j).charAt(tmpList.get(j));

            }
            re.add(a);
        }


        return re;

    }


    public List<String> letterCombinations2(String digits){

        List<String> list = new ArrayList<>();

        Map<Character,String> map = new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        for (int i = 0; i < digits.length(); i++) {
            String s = map.get(digits.charAt(i));

            List<String> tmp = new ArrayList<>();

            for (int j = 0; j < s.length(); j++) {
                if (list.size()==0){
                    tmp.add(""+s.charAt(j));
                }
                for (int k = 0; k < list.size(); k++) {
                    tmp.add(list.get(k)+s.charAt(j));
                }
            }
            list = tmp;

        }
        return list;


    }


    public static void main(String[] args) {

        Solution s = new Solution();

        List<String> list = s.letterCombinations2("782");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
