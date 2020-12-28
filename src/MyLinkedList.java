public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

    }

    public MyLinkedList(E e) {
        head = new Node(e);
        numNodes++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;
        Node input = new Node(e);
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = input;
        input.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        if (index==0){
            head = head.next;
            numNodes--;
            return (E)temp;
        }
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
        return (E) temp.next;
    }

    public boolean remove(Object o) {
        Node node = new Node(o);
        Node temp = head;

        if (temp.data == node.data) {
            head = head.next;
            numNodes--;
            return true;
        }
        for (int i = 0; i < numNodes - 1; i++) {
            if (temp.next.data == node.data) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E e) {
        Node temp = head;
        Node input = new Node(e);
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == input.data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node input = new Node(e);
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == input.data) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void showAll() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.print(temp.getData()+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
