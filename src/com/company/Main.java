package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        Random random = new Random();
        int a=0,b=0,c=0;
        for (int i=0; i<50; i++) {
            arrayList1.add(random.nextInt(1,100) );
            a++;
        }
        System.out.print(a+":"+arrayList1);

        for (Integer arr:arrayList1) {
            if((arr%2)!=0){
                arrayList2.add(arr);
                b++;
            }else {
                arrayList3.add(arr);
                c++;
            }

        }
        System.out.print("\n"+b+": "+arrayList2);
        System.out.print("\n"+c+": "+arrayList3);
    }
}
