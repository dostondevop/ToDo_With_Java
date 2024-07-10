public class MyHashMap<K, V> {

    private static class Entry<K, V> {
        private K k;
        private V v;

        private Entry<K, V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    private final Entry<K, V>[] entries = new Entry[16];
    private int size = 0;

    public V put(K k, V v) {
        int bucketIndex = hash(k);
        Entry<K, V> entry = entries[bucketIndex];
        if (entry == null) {
            entries[bucketIndex] = new Entry<>(k, v);
            size ++;
            return v;
        }

        while (entry.next != null) {
            if (entry.k.equals(k)) {
                entry.v = v;
                return v;
            }
            entry = entry.next;
        }
        if (entry.k.equals(k)) {
            entry.v = v;
            return v;
        }
        entry.next = new Entry<>(k,v);
        size ++;
        return v;
    }

    public V get(K k) {
        int bucketIndex = hash(k);
        Entry<K, V> entry = entries[bucketIndex];

        while (entry != null) {
            if (entry.k.equals(k)) {
                return entry.v;
            }
            entry = entry.next;
        }
        return null;
    }

    public int hash(K k) {
        return k.hashCode() % 16;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
