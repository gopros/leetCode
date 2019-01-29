package test;

import java.util.Arrays;
import java.util.Comparator;

public class testCompararor {

    public static void main(String[] args) {



        int[] a1 = {7,0};
        int[] a2 = {4,4};
        int[] a3 = {7,1};
        int[] a4 = {5,0};
        int[] a5 = {6,1};
        int[] a6 = {5,2};

        int[][] b = {a1,a2,a3,a4,a5,a6};


        Arrays.sort(b, new Comparator<int[]>() {
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

        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }



    }
}
