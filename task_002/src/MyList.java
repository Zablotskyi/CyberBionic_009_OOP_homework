import java.util.Arrays;

public class MyList<T> {
    private Object[] data;
    private int size;

    public MyList() {
        this.data = new Object[10];
        this.size = 0;
    }

    public void add(T item) {
        capacity(size + 1);
        data[size] = item;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    private void capacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = data.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Такий індекс виходить за розміри списку!");
        }
    }
}
