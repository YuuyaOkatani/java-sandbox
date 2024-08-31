package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many roos will be rented? : ");

        int roos = sc.nextInt();

        newRoom[] rooms = new newRoom[roos]; 

        for(int i = 0; i < roos; i++){
            
            System.out.print("Digite o nome de quem irá usar o quarto: "); 
            String name = sc.next(); 
            System.out.print("Digite o email do usuário: "); 
            String email = sc.next();
            System.out.print("Digite o número do quarto: "); 
            int num = sc.nextInt();

            rooms[i] = new newRoom(num, name, email);
        }
        System.out.println("Busy rooms: "); 
        for(newRoom room : rooms){
            System.out.println(room.getId() + ": " + room.getName()+ ", " + room.getEmail()); 
            

        }
        


        
     

        sc.close();
    }
}