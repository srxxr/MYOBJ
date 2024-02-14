//package H4;
//public class LinkedQueue<E> implements Queue<E> {
//    private Node<E> front;
//    private Node<E> rear;
//    private int size;
//
//    // Rest of the class implementation
//
//    public void concatenate(LinkedQueue<E> Q2) {
//        if (Q2.isEmpty()) {
//            return; // Nothing to concatenate
//        }
//
//        if (isEmpty()) {
//            front = Q2.front;
//        } else {
//            rear.next = Q2.front;
//        }
//
//        rear = Q2.rear;
//        size += Q2.size;
//
//        Q2.front = null;
//        Q2.rear = null;
//        Q2.size = 0;
//    }
//
//    private static class Node<E> {
//        E element;
//        Node<E> next;
//
//        Node(E element) {
//            this.element = element;
//        }
//    }
//}