package com.starylwu.linklist;

/**
 * @Author: WuYuLong
 * @Date: Create in 17:13 2018/10/10
 * @DESC: 1.单链表的插入、删除、查询
 *        2.链表目前存储int类型的值
 */
public class SinglyLinkedList {

    /**
     * 定义链表头
     */
    private Node head;

    /**
     * 插入(插入到尾部)
     */
    public void add(int value){
        Node node = new Node(value, null);
        if (head == null){
            head = node;
        } else {
            if (head.next == null){
                head.next = node;
                return;
            }
            Node last = head;
            while (last.next.next != null){
                last = last.next;
            }
            last.next.next = node;
        }
    }

    /**
     * 插入(插入到头部)
     * @param value
     */
    public void addBeforeHeader(int value){
        Node node = new Node(value, null);
        if (head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /**
     * 删除
     * @param value
     */
    public void delete(int value){
        if (head == null){
            return;
        }

        Node p = head;
        Node q = null;
        while (p != null && p.data != value){
            q = p;
            p = p.next;
        }
        if (p == null){
            return;
        }
        if (q == null){
            head = head.next;
        } else {
            q.next = q.next.next;
        }
    }

    /**
     * 根据下标获取值
     * @param index
     * @return
     */
    public int get(int index){
        if (head == null){
            return -1;
        }
        int count = 0;
        Node p = head;
        while (count < index){
            p = p.next;
            count ++;
        }
        if (p == null){
            throw new ArrayIndexOutOfBoundsException("index [" + index + "].");
        }
        return p.data;
    }

    /**
     * 获取链表中的第一个值
     * @return
     */
    public int getFirst(){
        if (head == null){
            return -1;
        }
        return head.data;
    }

    /**
     * 获取链表中的最后一个值
     * @return
     */
    public int getLast(){
        if (head == null){
            return -1;
        }
        Node p = head;
        while (p.next != null){
            p = p.next;
        }
        return p.data;
    }

    /**
     * 打印
     */
    public void print(){
        Node p = head;
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }


    public static class Node{
        private int data;

        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
}
