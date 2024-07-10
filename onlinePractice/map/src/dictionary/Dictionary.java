package dictionary;

public class Dictionary<K, V> {
    public static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] table;

    public Dictionary() {
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public Dictionary(int capacity) {
        this.table = new Node[capacity];
    }

    public V put (K key, V value) {
        int hash = hash(key);
        int index = index(hash);
        
        return  value;
    }

    private int hash(K key) {
        return key == null ? 0 : key.hashCode();
    }
    private int index(int hash) {
        return hash % table.length;
    }
    private int index(K key) {
        return hash(key) % table.length;
    }

    private static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        public Node(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }
    }
}
