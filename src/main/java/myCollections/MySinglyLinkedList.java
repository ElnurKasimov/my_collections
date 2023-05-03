package main.java.myCollections;


public class MySinglyLinkedList<T> {
    ListNode head;

    public MySinglyLinkedList() {
        this.head = null;
    }

    public void add(T val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void remove(T val) {
        if (head == null) {
            return;
        }

        if (head.val.equals(val)) {
            head = head.next;
            return;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val.equals(val)) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public void printList() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static class ListNode <T>{
        T val;
        ListNode next;

        public ListNode(T val) {
            this.val = val;
            this.next = null;
        }
    }

}

