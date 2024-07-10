package dictionary;

import java.util.Arrays;

public class SimpleDictionary<K,V> {
    private Entry<K,V>[] dictionary;
    private static final int DEFAULT_CAPACITY = 16;

    public SimpleDictionary() {
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public SimpleDictionary(int capacity) {
        this.dictionary = new Entry[capacity];
    }

    @Override
    public String toString() {
        return Arrays.toString(dictionary);
    }

    public V put(K key, V value) {
            int hashCode = key.hashCode();
            int index = hashCode % dictionary.length;
            dictionary[index]  = new Entry<>(key,value);
        return value;
    }

    public V get(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % dictionary.length;
        var entry = dictionary[index];
        if (entry == null) {
            return null;
        }
        return entry.value;
    }

    public static class Entry<K,V>{
     K key;
     V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "%s=%s".formatted(key,value);
        }
    }
}
