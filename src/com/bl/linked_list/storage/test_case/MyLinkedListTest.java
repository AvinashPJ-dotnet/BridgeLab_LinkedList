package com.bl.linked_list.storage.test_case;

import com.bl.linked_list.storage.MyLinkedList;
import com.bl.linked_list.storage.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddedToTop() {
        MyNode<Object> myFirstNode = new MyNode<>(70);
        MyNode<Object> mySecondNode = new MyNode<>(30);
        MyNode<Object> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddedToEnd() {
        MyNode<Object> myFirstNode = new MyNode<>(50);
        MyNode<Object> mySecondNode = new MyNode<>(30);
        MyNode<Object> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
