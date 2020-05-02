import java.util.ArrayList;

public class HashTable<K, V> {

    private int capacity = 4;
    private static final float FACTOR = 0.75F;

    private int size;

    private ArrayList<Entry<K, V>> bucketArray;

    public HashTable() {
        this.bucketArray = new ArrayList<>();
        this.size = 0;
        for (int i = 0; i < this.capacity; i++) {
            bucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % this.capacity);
        return index;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(K key, V value) {
        int bucketIndex = this.getBucketIndex(key);
        Entry<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        this.size++;
        head = bucketArray.get(bucketIndex);

        Entry<K, V> newEntry = new Entry<K, V>(key, value);
        newEntry.next = head;
        bucketArray.set(bucketIndex, newEntry);
    }
}
