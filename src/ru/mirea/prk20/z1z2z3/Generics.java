package ru.mirea.prk20.z1z2z3;

import java.io.Serializable;

public class Generics<T extends Comparable,V extends Serializable,K> {
    private T t;
    private V v;
    private K k;

    public Generics(T t, V v,K k)
    {
        this.t=t;
        this.v=v;
        this.k=k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public String RNC()
    {
        return t.getClass() + "\n" + v.getClass() + "\n" + k.getClass() + "\n";
    }
}
