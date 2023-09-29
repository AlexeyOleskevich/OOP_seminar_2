package generics;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> linkedList = new GBLinkedList<>();
        linkedList.addLast(1);
        linkedList.addFirst(2);
        linkedList.addFirst(54);
        linkedList.addLast(12);
        System.out.println(linkedList);
        System.out.println(linkedList.size());


    }


}
