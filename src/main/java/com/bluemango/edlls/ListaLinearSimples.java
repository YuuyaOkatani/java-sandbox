/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemango.edlls;

/**
 *
 * @author tadeu.maffeis
 */


//  um breve resumo: 
//  Na estrutura de dados, um nó é adicionado de forma sequencial, 
//  neste programa em especifico, um nó pode entrar em qualquer posição, e entrando um nó, outros elementos 
//  próximos irão pular uma casa. Caso um nó for apagado, um elemento anterior ao seu irá ocupar o seu lugar. 



public class ListaLinearSimples {

    private Node top;
    private Node bottom;
    private long size;

    public ListaLinearSimples() {
        this.top = null;
        this.bottom = null;
        this.size = 0;
    }

    // Professor complicou mais ainda, alog que poderia ser bem mais simples
    // Colocar qualquer nó em qualquer posição
    public void insertPosN(long pos, Node node) {
        // Se a lista estiver vazio e a posição for diferente de 0: 
        if (this.empty() && pos != 1) {
            return; // exceção
        }
        // Se a lista for maior  que o tamanho da lista e a posição for diferente de 1
        if (pos > this.length() && pos != 1) {
            return;
        }
        // Caso a posição for 1, então irá adicionar um novo item
        if (pos == 1) {
            this.add(node);
            return;
        }

        Node nodePrev = this.searchPos(pos - 1);
        Node nodePos = nodePrev.getNext();
        node.setNext(nodePos);
        nodePrev.setNext(node);
        this.addSize();
    }

    public void insertInOrd(Node node)
    {
        
    }
    
    // Remover qualquer nó de qualquer posição
    public Node removePosN(long pos) {
        if (this.empty()) {
            return null;
        }

        if (pos == 1) {
            return this.remove();
        }

        if (this.length() == pos) {
            return this.pop();
        }
        // remover pos N com size > que 1 e 1 < pos < size
        if (pos != 1 && this.length() <= 1) {
            return null;
        }

        if (pos > this.length()) {
            return null;
        }

        Node ant = this.searchPos(pos - 1);
        Node aux = ant.getNext();

        ant.setNext(aux.getNext());
        aux.setNext(null);

        this.decSize();
        
        return aux;
    }

    private boolean empty() {
        return (this.top == null && this.bottom == null);
    }

    // irá adicionar um nó: 
    public void add(Node node) {
        // Se alista estiver vazia:
        if (this.empty()) {
            this.top = this.bottom = node;
        } 
        
        else {
            // Um novo nó é criado e colocado no topo, e o outro que estava no top irá para trás
            Node aux = this.top;
            this.top = node;
            this.top.setNext(aux);
        }
        // Aumentar tamanho da lista
        this.addSize();
    }

    // Esta função é o contrario do add. O objeto digitado será colocado na outra ponta
    public void append(Node node) {

        // Caso a lista estiver vazia 
        if (this.empty()) {
            this.top = this.bottom = node;
        } 


        // Caso não estiver vazia:
        else {
            // Novo objeto é criado e colocado como o ultimo
            Node aux = this.bottom;
            this.bottom = node;
            aux.setNext(node);
        }

        this.addSize();
    }

    // Irá remover um nó do inicio da lista
    public Node remove() {
        Node retNode = null;
        Node aux = null;

        // Caso uma lista estiver nula (não tiver o topo nem o útimo)
        if (this.empty()) {
            return null;
        }


        // Caso a lista for 0 
        if (this.length() <= 1) {
            retNode = this.top;
            this.top = this.bottom = null;
        } 
        
        // Caso a lista não for 0 
        else {
            retNode = this.top;
            aux = retNode.getNext();
            retNode.setNext(null);
            this.top = aux;
        }

        this.decSize();

        return retNode;
    }

    // Apagar o nó do final
    public Node pop() {
        Node retNode = null;
        Node aux = null;

        // Caso a lista estiver vazia
        if (this.empty()) {
            return null;
        }

        // Caso a lista for 0 
        if (this.length() <= 1) {
            retNode = this.top;
            this.top = this.bottom = null;
        } 
        
        // Caso a lista não for 0 
        else {
            retNode = this.bottom;
            aux = this.searchPos(this.length() - 1);
            aux.setNext(null);
            this.bottom = aux;
        }

        this.decSize();

        return retNode;
    }


    public void clear() {
        while (!this.empty()) {
            this.pop();
        }
    }

    // Aumentar o tamanho da lista 
    private void addSize() {
        this.size++;
    }

    // Diminui o tamanho da lista
    private void decSize() {
        this.size--;
    }

    // Retornar o tamanho da lista 
    private long length() {
        return this.size;
    }

    public Node searchPosWithClone(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        for (int indx = 1; position != indx && aux != null; indx++) {
            aux = aux.getNext();
        }

        Node retNode = new Node(aux.getId(), aux.getValue());

        return retNode;
    }

    public NodeValue searchPosWithInterface(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        for (int indx = 1; position != indx && aux != null; indx++) {
            aux = aux.getNext();
        }
        return (NodeValue) aux;
    }

    private Node searchPos(long position) {
        if (this.empty() || position > this.length()) {
            return null;
        }

        Node aux = this.top;
        for (int indx = 1; position != indx && aux != null; indx++) {
            aux = aux.getNext();
        }
        return aux;
    }


    
    public Node searchContent(String key) {
        if (this.empty()) {
            return null;
        }
        Node aux = this.top;
        while (aux != null) {
            if (key.equals(aux.getId())) {
                break;
            }
            aux = aux.getNext();
        }

        return aux;
    }

    public void show() {
        Node aux = this.top;
        while (aux != this.bottom) {
            System.out.print(" --> " + aux.getValue().toString());
            aux = aux.getNext();
        }
        if (aux != null) {
            System.out.print(" --> " + aux.getValue());
        }
    }
}
