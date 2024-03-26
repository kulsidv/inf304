package Iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<T> {
    int size;
    Node head;
    Node tail;
    MyArrayList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(T value) {
        Node<T> add = new Node<T>(size, value);
        if(head == null) {
            head = add;
            tail = add;
        } else {
            tail.next = add;
            tail = add;
        }
        size++;
    }

    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.index == index) return current.value;
            current = current.next;
        }
        return null;
    }

    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<T> implements Iterator<T>{
        int currentIndex;
        MyIterator() {
            currentIndex = 0;
        }
        public T next(){
            return (T)get(currentIndex++);
        }
        public boolean hasNext() {
            return currentIndex < size;
        }
        public void remove() {
            currentIndex = 0;
        }
        public void forEachRemaining(MyConsumer<T> myConsumer) {
            while(this.hasNext()) {
                myConsumer.accept(this.next());
            }
        }
    }

    private class Node<T> {
        int index;
        T value;
        Node<T> next;
        Node(int index, T value) {
            this.index = index;
            this.value = value;
            this.next = null;
        }
    }
}
