package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class array {

    public static void main(String[] args) {

        ArrayList<Integer> intlist = new ArrayList<>();
        for(int i = 1; i <=5;i++){
            Scanner scanner = new Scanner(System.in);
            Integer m = scanner.nextInt();
            intlist.add(m);
        }

        for(Integer in: intlist){
            System.out.println(in);
        }

        Map<String ,Integer> stfu = new HashMap<>();
        ArrayList<String> string = new ArrayList<>();
        for(int j = 1; j <=5;j++){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            stfu.put(name,j);
            string.add(name);
        }
         for(String stf : string){
             System.out.println(stf + " " + stfu.get(stf));
         }
    }
}
