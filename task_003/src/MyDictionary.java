import java.util.Arrays;

public class MyDictionary<K, V> {
    private Object[] keys;
    private Object[] values;
    private int size;

    public MyDictionary() {
        keys = new Object[10];
        values = new Object[10];
        size = 0;
    }

    public void add(K key, V value) {
        capacity(size + 1);
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public K getKey(int index) {
        checkIndex(index);
        return (K) keys[index];
    }

    public V getValue(int index) {
        checkIndex(index);
        return (V) values[index];
    }

    public int getSize() {
        return size;
    }

    private void capacity(int minCapacity) {
        if (minCapacity > keys.length) {
            int newCapacity = keys.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            keys = Arrays.copyOf(keys, newCapacity);
            values = Arrays.copyOf(values, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Такий індекс виходить за розміри списку!");
        }
    }
}
