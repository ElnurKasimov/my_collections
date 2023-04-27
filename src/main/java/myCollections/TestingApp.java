package main.java.myCollections;

public class TestingApp {
    public static void main(String[] args) {
        System.out.println(" -----------------   testing My Array List -----------------------------");
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("hello!");
        System.out.println("size - " + arrayList.getSize() + "; value - " + arrayList.get(0));
        arrayList.add("worrld");
        System.out.println("size - " + arrayList.getSize() + "; value - " + arrayList.get(1));
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

    }
}
