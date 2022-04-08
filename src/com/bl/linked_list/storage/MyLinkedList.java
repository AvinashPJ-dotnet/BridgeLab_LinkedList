package com.bl.linked_list.storage;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode) {
        if (head == null)
            head = newNode;
        if (tail == null)
            tail = newNode;
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = head;
        head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        return tail;
    }

    public int search(INode searchNode) {
        INode tempNode = head;
        int countPosition = 0;
        while (tempNode != null) {
            if (tempNode == searchNode)
                return countPosition;
            tempNode = tempNode.getNext();
            countPosition++;
        }
        return -1;
    }

    public void printMyNode() {
        StringBuffer myNode = new StringBuffer("My Node: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNode.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }
}
