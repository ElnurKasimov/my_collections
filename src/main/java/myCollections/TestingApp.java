package main.java.myCollections;

import java.util.HashMap;
import java.util.Map;

public class TestingApp {
    public static void main(String[] args) {
//        System.out.println(" -----------------   testing My Array List -----------------------------");
//        MyArrayList<String> arrayList = new MyArrayList<>();
//        arrayList.add("hello!");
//        System.out.println("size - " + arrayList.getSize() + "; value - " + arrayList.get(0));
//        arrayList.add("worrld");
//        System.out.println("size - " + arrayList.getSize() + "; value - " + arrayList.get(1));
//        System.out.println(arrayList);
//        arrayList.remove(1);
//        System.out.println(arrayList);
//        arrayList.clear();
//        System.out.println(arrayList);

//        System.out.println(" -----------------   testing My Queue -----------------------------");
//        MyQueue<String> queue = new MyQueue<>();
//        queue.add("hello!");
//        System.out.println("size - " + queue.getSize() + "; value - " + queue.get(0));
//        queue.add("worrld");
//        System.out.println("size - " + queue.getSize() + "; value - " + queue.get(1));
//        System.out.println(queue);
//        queue.remove(1);
//        System.out.println(queue);
//        queue.clear();
//        System.out.println(queue);


//        System.out.println(" -----------------   testing My Stack -----------------------------");
//        MyStack<String> hashMap = new MyStack<>();
//        hashMap.push("hello!");
//        System.out.println("size - " + hashMap.getSize() + "; value - " + hashMap.get(0));
//        hashMap.push("world");
//        System.out.println("size - " + hashMap.getSize() + "; value - " + hashMap.get(1));
//        System.out.println(hashMap);
//        hashMap.pop();
//        System.out.println(hashMap);
//        hashMap.clear();
//        System.out.println(hashMap);

//        System.out.println(" -----------------   testing My Doubly Linked List -----------------------------");
//        MyDoublyLinkedList<String> singlyList = new MyDoublyLinkedList<>();
//        singlyList.printAll();
//        singlyList.add("hello!");
//        System.out.println("size - " + singlyList.size() + "; value - " + singlyList.get(0));
//        singlyList.add("world");
//        System.out.println("size - " + singlyList.size() + "; value - " + singlyList.get(1));
//        singlyList.printAll();
//        singlyList.remove(0);
//        System.out.println(singlyList);
//        singlyList.clear();
//        singlyList.printAll();

//        System.out.println(" -----------------   testing My Hash Map -----------------------------");
//        MyHashMap<String, String> hashMap = new MyHashMap<>();
//        hashMap.printAll();
//        hashMap.put("1", "test0");
//        hashMap.printAll();
//        hashMap.put("2", "test1");
//        hashMap.put("3", "test2");
//        hashMap.put("4", "test3");
//        hashMap.put("5", "test4");
//        hashMap.put("6", "test5");
//        hashMap.put("6", "test55");
//        hashMap.put("7", "test6");
//        hashMap.put("8", "test7");
//        hashMap.put("9", "test8");
//        hashMap.put("10", "test9");
//        hashMap.put("11", "test10");
//        hashMap.put("12", "test11");
//        hashMap.put("13", "test12");
//        hashMap.put("14", "test13");
//        hashMap.put("15", "test14");
//        hashMap.put("16", "test15");
//        hashMap.printAll();
//        System.out.println("hashMap.get(\"7\") = " + hashMap.get("7"));
//        //System.out.println("hashMap.get(\"33\") = " + hashMap.get("33"));
//        hashMap.remove("14");
//        hashMap.printAll();
//        hashMap.remove("1");
//        hashMap.printAll();
//        hashMap.clear();
//        hashMap.printAll();

        System.out.println(" -----------------   testing My Singly Linked List -----------------------------");
        MySinglyLinkedList<String> singlyList = new MySinglyLinkedList<>();
        singlyList.printList();
        //singlyList.remove("test");
        singlyList.add("hello");
        singlyList.printList();
        singlyList.add("world");
        singlyList.add("!");
        singlyList.printList();
        singlyList.remove("world");
        singlyList.printList();
        singlyList.clear();
        singlyList.printList();
    }
}
