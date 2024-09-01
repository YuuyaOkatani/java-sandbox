package com.bluemango;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered?: ");

        int num = sc.nextInt();

 

        List<employee> employees = new ArrayList<>(); 

        for (int i = 0; i < num; i++) {
            
            System.out.println("Employee #" + i + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employee e = new employee(id, name, salary);
            employees.add(e);

            
            


        }

        // System.out.print("Enter the employee that will have salary increase: ");
        // final id = sc.nextInt();
        // Optional<employee> e = employees.stream().filter(x -> x.getId() == id).findFirst();
        
        // if(e != null){
        //     System.out.print("Enter the percentage: ");

        // }
        
        


        sc.close();
    }
}