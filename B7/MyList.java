import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<E> implements Iterable<E> {
    private int size;
    //private E current;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return elements[i];
    }

    public E remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        E removedElement = elements[i];
        System.arraycopy(elements, i + 1, elements, i, size - i - 1);
        elements[--size] = null; // Clear the last element
        return removedElement;
    }

    public void add(E element) {
        if (size == elements.length) {
            // Double the array size if it's full
            E[] newElements = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[currentIndex++];
            }
        };
    }

}
