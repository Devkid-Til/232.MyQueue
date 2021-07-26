public interface Stack<E> {

    E pop();
    E peek();
    int getSize();
    boolean isEmpty();
    void push(E e);

}
