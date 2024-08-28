package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); 
        int num2 = sc.nextInt();
        double result = 0;

        switch (num) {
            case 1:
            result = 4 * num2; 
            
            break;
            case 2:
            result = 4.50 * num2; 
            

            break;
            case 3:
            result = 5 * num2;

            break;
            case 4:
            result = 2 * num2;

            break;
            case 5:
            result = 1.50 * num2;

            break;
        
        }

        System.out.printf("Total: R$ %.2f%n" , result); // nunca se esqueça disso 


     

        sc.close();
    }
}