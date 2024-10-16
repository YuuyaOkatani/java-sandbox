/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemango.edlls;

/**
 *
 * @author tadeu.maffeis
 */
public class Node implements NodeValue {
    private String id;
    private Object value;
    private Node next;

    public Node() {
        this.id = "";
        this.next = null;
        this.value = null;
    }
    
    public Node(String id, Object value) {
        this.id = id;
        this.value = value;
        this.next = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    // Como é uma lista encadeada, então ele dará direção para o seu próximo: 
    public void setNext(Node next) {
        this.next = next;
    }}
