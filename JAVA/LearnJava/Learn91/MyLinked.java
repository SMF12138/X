package NewLearn.Learn91;

public class MyLinked<E> {
    private int size;
    private Node<E> first;

    public MyLinked() {

    }

    public void add(E element) {
        if (first == null) {
            first = new Node<>(element, null);
            size++;
            return;
        }
        Node<E> last = findLast();
        last.next = new Node<>(element, null);
        size++;
    }

    private Node<E> findLast() {
        if (first == null) {
            return null;
        }
        Node<E> last = first;//假设第一个节点是最后一个节点
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element, null);
        if (index == 0) {
            newNode.next = first;
        } else {
            Node<E> prev = node(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> node(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> prev = first;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        return prev;
    }

    public void remove(int index) {
        if (index == 0) {
            Node<E> oldFirst = first;
            first = first.next;
            oldFirst.next = null;
        } else {
            Node prev = node(index - 1);
            Node removed = node(index);
            prev.next = removed.next;
            removed.next = null;
            removed.element = null;
        }
        size--;
    }

    public void set(int index, E element) {
        Node<E> node = node(index);
        node.element = element;
    }

    public E get(int index) {
        return node(index).element;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {//定义一个内部类
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}
