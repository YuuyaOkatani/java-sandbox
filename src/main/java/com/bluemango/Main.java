package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o X: "); 
        int x = sc.nextInt();
        System.out.print("Digite o Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("Primeiro");
                

            }
            else if(x < 0 && y > 0) {
                System.out.println("Segundo");
                

            }
            else if(x < 0 && y < 0) {
                System.out.println("Terceiro");
                

            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            
            }
            System.out.print("Digite o X: ");
            x = sc.nextInt();
            System.out.print("Digite o Y: ");
            y = sc.nextInt();
            
        }

  


        
     

        sc.close();
    }
}