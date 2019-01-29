package code406;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public int[][] reconstructQueue(int[][] people) {

        List<List<Integer>> a = new ArrayList<>();
        int[][] re = new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]>o2[0])return -1;
                else if (o1[0]<o2[0]) return 1;
                else{
                    if (o1[1]>o2[1]) return 1;
                    else if (o1[1]<o2[1]) {
                        return -1;
                    }
                }
                return 0;

            }
        });

        for (int i = 0; i < people.length; i++) {
            List<Integer> list = new ArrayList();
            list.add(people[i][0]);
            list.add(people[i][1]);
            a.add(people[i][1],list);
        }

        for (int i = 0; i < people.length; i++) {
            re[i] = new int[]{a.get(i).get(0), a.get(i).get(1)};
        }
        
        
        return re;

    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a1 = {7,0};
        int[] a2 = {4,4};
        int[] a3 = {7,1};
        int[] a4 = {5,0};
        int[] a5 = {6,1};
        int[] a6 = {5,2};

        int[][] b = {a1,a2,a3,a4,a5,a6};
        int[][] c = s.reconstructQueue(b);

        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }


    }



}
