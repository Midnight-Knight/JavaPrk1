package ru.mirea.prk23.z1;

import ru.mirea.prk23.z2.AbstractQueue;

public class ArrayQueueModule extends AbstractQueue {
    private Object[] q;

    private static ArrayQueueModule instance;

    private ArrayQueueModule(){
        q = new Object[START_CAPACITY];
        head = tail = 0;
    }

    public static ArrayQueueModule getInstance(){
        if(instance == null)
            instance = new ArrayQueueModule();
        return instance;
    }

    @Override
    public Object dequeue(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if(head == q.length) head = 0;
        if(Math.abs(head-tail) < q.length / 2) resize(q.length / 2);
        return r;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public void enqueue(Object element){
        q[tail++] = element;
        if(tail == q.length) tail = 0;
        if(tail == head) resize(q.length * 2);
    }

    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(q, head, nq, 0, Math.abs(head-tail));
        tail = Math.abs(head-tail);
        head = 0;
        q = nq;
    }

    @Override
    public Object element(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    @Override
    public boolean clear(){
        boolean r = !isEmpty();
        head = tail = 0;
        resize(START_CAPACITY);
        return r;
    }

}
