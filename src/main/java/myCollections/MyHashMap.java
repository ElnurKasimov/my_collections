package main.java.myCollections;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> {
    private Node[] bucket;
    private int size;
    private int index;
    public MyHashMap() {
        size = 10;
        bucket = new Node[size];
        index = 0;
    }

    public int getSize() {return this.size;};
    public int getIndex() {return this.index;};
    public void setBucket(Node[] updated) {this.bucket = updated;}


    public void printAll() {
        System.out.println("[");
        for(Node node : bucket) {
            if (node !=null) {
            System.out.println("(" +node.key.toString() + " : " + node.value.toString()  + ")," );
            }
        }
        System.out.println("]");
    }

    public void put  (K key, V value) {
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.code = Math.abs(node.key.hashCode());
        // key uniqueness check
        for (Node n : bucket) {
            if (n != null && n.code == node.code) {
                node.index = n.index;
            }
        }
        if (node.index == 0) {
            index++;
            node.index = index;
        }
        // Checking that the length of the array is sufficient
        if (index == size) {
            int newsize = (int) (size*1.5) ;
            Node[] updated =  new Node[newsize];
            updated =  Arrays.copyOf(bucket, newsize);
            this.setBucket(updated);
            this.size = newsize;
            }
        bucket[node.index] = node;

    }

    public V get (K key) {
        for(Node node : bucket) {
            if (node != null && key.equals(node.getKey())) return (V) node.getValue();
        }
        throw new MyIllegalArgumentException( "trying to get a key which is absent ");
    }

    public void remove (K key) {
        int deletingIndex = -1;
        for (Node node : bucket) {
            if (node != null && key.equals(node.getKey())) deletingIndex = node.getIndex();
        }
        if (deletingIndex < 0) throw new  MyIllegalArgumentException
                ("Trying to delete a pair which doesn't have such key");
        int i = deletingIndex;
        while (bucket[i+1] != null ) {
            bucket[i] = bucket[i+1];
            bucket[i].setIndex(bucket[i].getIndex()-1);
            i++;
        }
        bucket[i] = null;
    }

    public void clear() {
        size = 10;
        bucket = new Node[size];
        index = 0;
    }

    public static class Node <K, V> {
        private K key;
        private V value;
        private int index;
        private int code;

        public K getKey() {return this.key;};
        public V getValue() {return this.value;};
        public int getIndex() {return this.index;};
        public void setIndex(int index) {this.index = index;}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) && value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}

