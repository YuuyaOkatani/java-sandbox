package com.bluemango.models;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> cardapio = new LinkedList<>();
        cardapio.add("Hamburguer");
        cardapio.add("Pizza");
        cardapio.add("Spaghetti");
        System.out.println(cardapio);

        LinkedList<String> cardapio2 = new LinkedList<>();
        cardapio2.add("Pasta");
        cardapio2.add("Sandwich");
        cardapio2.add("Lasagna"); 
        System.out.println(cardapio2);

        // Que legal, é assim que funciona o linkedlist 
        cardapio.addFirst("Risotto"); 
        System.out.println(cardapio);
        cardapio.addFirst("Croassant");
        System.out.println(cardapio);

        //https://www.w3schools.com/java/java_ref_linkedlist.asp
        
        // cardapio.addAll(cardapio2);
        // System.out.println(cardapio);
        
        // cardapio.remove("Pizza");
        // System.out.println(cardapio);
        
        // cardapio.add(1, "Batata Frita");
        // System.out.println(cardapio);

        // System.out.println(cardapio.get(1));
    }
    
    
}
