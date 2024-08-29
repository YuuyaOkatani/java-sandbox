package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); 

        for(int i = 1; i < num; i++) {
            if(num % i != 0 && i % 2 != 0) {
                System.out.println(i);
            }

        }

        
     

        sc.close();
    }
}