package com.starylwu.linklist;

/**
 * @Author: WuYuLong
 * @Date: Create in 18:47 2018/10/10
 * @DESC:
 */
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.print();
        linkedList.addBeforeHeader(5);
        linkedList.print();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
