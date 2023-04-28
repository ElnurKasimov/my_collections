package main.java.myCollections;

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

        System.out.println(" -----------------   testing My Queue -----------------------------");
        MyQueue<String> queue = new MyQueue<>();
        queue.add("hello!");
        System.out.println("size - " + queue.getSize() + "; value - " + queue.get(0));
        queue.add("worrld");
        System.out.println("size - " + queue.getSize() + "; value - " + queue.get(1));
        System.out.println(queue);
        queue.remove(1);
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}
