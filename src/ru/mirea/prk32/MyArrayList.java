package ru.mirea.prk32;

public class MyArrayList<T> {
    private final int CUT = 4;
    private final int SIZE_OF_PRIMARY = 8;
    private Object[] array = new Object[8];
    private int element_in_array = 0;

    public MyArrayList() {
    }

    private void resize(int new_lenght) {
        Object[] new_array = new Object[new_lenght];
        System.arraycopy(this.array, 0, new_array, 0, this.element_in_array);
        this.array = new_array;
    }

    public void add(T new_item) {
        if (this.element_in_array == this.array.length - 1) {
            this.resize(this.array.length * 2);
        }

        this.array[this.element_in_array] = new_item;
        ++this.element_in_array;
    }

    public void remove(int index_of_item) {
        for(int i = index_of_item; i < this.element_in_array; ++i) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.element_in_array] = null;
        --this.element_in_array;
        if (this.element_in_array < this.array.length / 4 && this.element_in_array > 8) {
            this.resize(this.array.length / 2);
        }

    }

    public void remove(T item) {
        int index_of_item = this.indexOf(item);

        for(int i = index_of_item; i < this.element_in_array; ++i) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.element_in_array] = null;
        --this.element_in_array;
        if (this.element_in_array < this.array.length / 4 && this.element_in_array > 8) {
            this.resize(this.array.length / 2);
        }

    }

    public T get(int index_of_item)
    {
        return (T) this.array[index_of_item];
    }

    public T get(String name)
    {
        for(int i = 0; i < this.element_in_array; ++i) {
            if (name == this.array[i]) {
                return (T) this.array[i];
            }
        }

        return null;
    }

    public T get(T item) {
        for(int i = 0; i < this.element_in_array; ++i)
        {
            if (item == this.array[i])
            {
                return (T) this.array[i];
            }
        }

        return null;
    }

    public int size() {
        return this.element_in_array;
    }

    public int indexOf(T item) {
        for(int i = 0; i < this.element_in_array; ++i) {
            if (item == this.array[i]) {
                return i;
            }
        }

        return -1;
    }
}