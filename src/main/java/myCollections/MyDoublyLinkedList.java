package main.java.myCollections;

//public class  MyDoublyLinkedList<T> {
//    private Node first = new Node();
//    private Node last = new Node();
//    private int size;
//
//    public MyDoublyLinkedList() {
//        first.next = last;
//        last.prev = first;
//        size=0;
//    }
//
//    public void printAll() {
//        Node currentElement = first.next;
//        System.out.println("[");
//        while ((currentElement) != null) {
//            System.out.println("Index " +currentElement.index + " -  value " + currentElement.value.toString()  + "," );
//            currentElement = currentElement.next;
//        }
//        System.out.println("]");
//    }
//
//    public void add  (T value) {
//        Node node = new Node();
//        node.value = value;
//        node.index = size;
//
//        Node lastNode = last.prev;
//        lastNode.next = node;
//        node.prev = lastNode;
//        last.prev = node;
//
//        size++;
//    }
//
//    public T get (int index) {
//        Node currentElement = first.next;
//        while ((currentElement.index) != index) {
//            currentElement = currentElement.next;
//        }
//        return (T) currentElement.value;
//    }
//
//    public void remove (int index) {
//
//        Node deletedElement = first.next;
//        while ((deletedElement.index) != index) {
//            deletedElement = deletedElement.next;
//        }
//
//        Node previousOfDeleted = deletedElement.prev;
//        Node nextOfDeleted = deletedElement.next;
//
//        previousOfDeleted.next = nextOfDeleted;
//        nextOfDeleted.prev = previousOfDeleted;
//        size--;
//
//        while ((nextOfDeleted) != null) {
//            nextOfDeleted.index--;
//            nextOfDeleted = nextOfDeleted.next;
//        }
//    }
//
//    public void clear() {
//        first.next = last;
//        last.prev = first;
//        size=0;
//    }
//    public int size() {  return size; }
//
//    public static class Node <T> {
//        private Node prev;
//        private int index;
//        private T value;
//        private Node next;
//    }
//}

public class MyDoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new MyIllegalArgumentException("No Such Element");
        }
        T removedData = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new MyIllegalArgumentException("No Such Element");
        }
        T removedData = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return removedData;
    }

    public T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            T removedData = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return removedData;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
