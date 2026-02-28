package umg.edu.gt.queue;

public class MyQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void enqueue(T item) {

        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public T dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T data = head.getData();
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        size--;
        return data;
    }

    public T peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return head.getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}