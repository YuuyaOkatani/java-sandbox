package com.bluemango;

import java.util.*;
import com.bluemango.edlls.*;

public class Main {
    public static void main(String[] args) {

        // Uma nova lista é criada: 
        ListaLinearSimples list = new ListaLinearSimples();


        Scanner in = new Scanner(System.in);
        int id = 0;
        String name = "";
        String email = "";
        list.show();
        
        for (; id >= 0;) {
            System.out.print("informations: ");
            id = in.nextInt();
            name = in.next();
            email = in.next();

            if (id < 0) {
                break;
            }

            //list.add(new Node(id + "", new Nothing(id, name, email)));
            // Adiciona um novo elemento / nó em qualquer posição
            list.insertPosN(1, new Node(id + "", new Nothing(id, name, email)));
        }
        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Digite um novo elemento / nó: ");
        id = in.nextInt(); 
        name = in.next(); 
        email = in.next();

        // Um novo elemento / nó inserido.
        list.insertPosN(1, new Node(id + "", new Nothing(id, name, email)));
        
        System.out.println("Nó inserido: " +  list.searchPosWithClone(id));
        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Digite a posição do nó que deseja procurar e fazer append: ");
        id = in.nextInt(); 
        Node searchNode = list.searchPosWithClone(id);
        System.out.println("Nó :" + searchNode.getValue() );
        System.out.println("\n\n");
        searchNode = list.searchPosWithClone(id);
        list.append(searchNode);
        System.out.println("Ao realizar append:");
        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Ao realizar remove: ");
        list.remove();
        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Ao aplicar pop: ");
        list.pop();

        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Ao aplicar pop novamente: ");
        list.pop();

        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Digite a posição para colocar o nó: ");
        int pos = in.nextInt();
        id = in.nextInt();
        name = in.next();
        email = in.next();
        Node insertNewNode = new Node(id + "", new Nothing(id, name, email));
        list.insertPosN(pos, insertNewNode);

        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Digite uma posição para remover o nó: ");
        int pos2 = in.nextInt();

        list.removePosN(pos2);
        System.out.println("\n\n");
        list.show();

        System.out.println("\n\n");
        System.out.println("Digite o id para encontrar nó: ");
        id = in.nextInt();
        Node searchNode2 = list.searchContent(id + "");
        System.out.println("\n\n");
        System.out.println("Nó :" + searchNode2.getValue());

        System.out.println("\n\n");
        System.out.println("Digite um id pare testar o getNext()"); 

        id = in.nextInt();
        searchNode2 = list.searchContent(id + "");
        System.out.println("\n\n");
        System.out.println("Nó :" + searchNode2.getNext().getValue());


        System.out.println("\n\n");
        System.out.println("Ao aplicar clear: ");
        list.clear();

        System.out.println("\n\n");
        list.show();

        
        
        // Mapeamento completo 



        
        
    }
}