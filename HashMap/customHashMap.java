package HashMap;

public class customHashMap<K, V> {

    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int capacity;
    private int size;
    private static final int DEFAULT_CAPACITY = 4;
    private static final float DEFAULT_LOAD_FACTOR = 0.75F;

    public customHashMap() {
        capacity = DEFAULT_CAPACITY;
        buckets = new Node[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        if (size >= capacity * DEFAULT_LOAD_FACTOR) {
            rehash();
        }

        int index = hash(key);
        Node<K, V> newNode = new Node<>(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node<K, V> curr = buckets[index];
            Node<K, V> prev = null;
            while (curr != null) {
                if (curr.key.equals(key)) {
                    curr.value = value;  
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = newNode;  
        }
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];
        Node<K, V> prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public V getOrDefault(K key, V defaultValue) {
        V value = get(key);
        return value != null ? value : defaultValue;
    }

    public void rehash() {
        Node<K, V>[] oldBuckets = buckets;
        capacity *= 2;
        buckets = new Node[capacity];
        size = 0;
        for (Node<K, V> bucket : oldBuckets) {
            Node<K, V> curr = bucket;
            while (curr != null) {
                put(curr.key, curr.value);
                curr = curr.next;
            }
        }
    }

    public float load() {
        return (float) size / capacity;
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            Node<K, V> current = buckets[i];
            if (current != null) {
                System.out.print("Bucket " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + ": " + current.value + "] -> ");
                    current = current.next;
                }
                System.out.println("null");
            } else {
                System.out.println("Bucket " + i + ": null");
            }
        }
    }

    public boolean containkey(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        customHashMap<String, Integer> map = new customHashMap<>();
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 18);
        map.display();
        System.out.println("Age of Akash: " + map.get("Akash"));
        map.remove("Akash");
        System.out.println("Age of Akash after removal: " + map.get("Akash"));

        System.out.println("Contains key 'Yash': " + map.containkey("Yash"));
        System.out.println("Contains key 'Akash': " + map.containkey("Akash"));

        System.out.println("Current load factor: " + map.load());

        map.display();

        System.out.println("Age of Yash (or default): " + map.getOrDefault("Yash", 0));
        System.out.println("Age of Akash (or default): " + map.getOrDefault("Akash", 0));
    }
}
