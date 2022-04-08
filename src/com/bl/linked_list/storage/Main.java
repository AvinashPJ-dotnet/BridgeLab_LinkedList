package com.bl.linked_list.storage;

public class Main {
    public static void main(String[] args) {
        MyNode<Object> myFirstNode = new MyNode<>(56);
        MyNode<Object> mySecondNode = new MyNode<>(30);
        MyNode<Object> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
    }
}
