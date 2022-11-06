package ru.mirea.prk23.z2;

public interface Queue
{
    Object dequeue();
    Object element();
    void enqueue(Object o);
    boolean isEmpty();
    boolean clear();
}
