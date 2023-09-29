package generics;

public interface GBList<E>{
    void addLast(E e);

    void addFirst(E e);

    int size();

    E getElementByIndex(int index);
}
