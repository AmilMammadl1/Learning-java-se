/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

/**
 *
 * @author amila
 */
public class MyLinkedList {
    private Node lastElement;
    class Node{
        private Object obj;
        private Node nextElement;
        
        public Node(Object obj, Node node){
            this.obj= obj;
            this.nextElement = node;
        }
        public void setNextElement(Node node){
            this.nextElement = node;
        }
        public void add(){
            
        }
    }
}
