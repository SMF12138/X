package NewLearn.Learn97;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private final Node<K, V>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this.table = new Node[16];//默认初始长度16(new数组时不能加泛型)
    }

    public int size() {
        return size;
    }

    public V put(K key, V value) {
        if (key == null) {
            return putForNullKey(value);
        }
        int hash = key.hashCode();
        int index = Math.abs(hash % table.length);//转化成下标
        Node<K, V> node = table[index];
        if (node == null) {
            table[index] = new Node<>(hash, key, value, null);
            size++;
            return value;
        }
        Node<K, V> prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node<>(hash, key, value, null);
        size++;
        return value;
    }

    private V putForNullKey(V value) {
        Node<K, V> node = table[0];
        if (node == null) {
            table[0] = new Node<>(0, null, value, null);
            size++;
            return value;
        }
        Node<K, V> prev = null;
        while (node != null) {
            if (node.key == null) {
                V oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node<>(0, null, value, null);
        size++;
        return value;
    }

    public V get(K key) {
        if (key == null) {
            Node<K, V> node = table[0];
            if (node == null) {
                return null;
            }
            while (node != null) {
                if (node.key == null) {
                    return node.value;
                }
                node = node.next;
            }
            int hash = key.hashCode();
            int index = Math.abs(hash % table.length);
            node = table[index];
            if (node == null) {
                return null;
            }
            while (node != null) {
                if (node.key.equals(key)) {
                    return node.value;
                }
                node = node.next;
            }
            return null;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyHashMap{" + "table=" + Arrays.toString(table) + ", size=" + size + '}';
    }

    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "hash=" + hash + ", key=" + key + ", value=" + value + ", next=" + next + '}';
        }
    }
}
