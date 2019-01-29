package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    public void msort(List<Integer> list,int s,int e){

        int mid = (s+e)/2;

        if (s<e){
            msort(list,s,mid);
            msort(list,mid+1,e);
            merge(list,s,mid,e);
        }


    }

    void merge(List<Integer> list , int s, int mid, int e){

        List<Integer> lnew = new ArrayList<>();
        int i=s,j=mid+1;
        while (i<=mid&&j<=e){
            if (list.get(i)<list.get(j)){
                lnew.add(list.get(i));
                i++;
            }else {
                lnew.add(list.get(j));
                j++;
            }

        }

        while (i<=mid){
            lnew.add(list.get(i));
            i++;
        }
        while (j<=e){
            lnew.add(list.get(j));
            j++;
        }
        int p = 0;
        for (int k = s; k <= e; k++) {
            list.set(k,lnew.get(p++));
        }


    }




    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        MergeSort mergeSort = new MergeSort();
        mergeSort.msort(list,0,list.size()-1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
