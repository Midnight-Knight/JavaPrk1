package ru.mirea.prk26.z3;

public class Hash {
    private Element[] elements;
    private int n;

    public Hash(int n)
    {
        System.out.println("Хэш-таблица с цепочками");
        this.n=n;
        elements = new Element[n];
        for (int i = 0; i < n; ++i)
        {
            elements[i] = null;
        }
    }

    private int HashFunc(int a)
    {
        return (a % n);
    }

    public void Add(int a)
    {
        if (elements[HashFunc(a)] == null)
        {
            elements[HashFunc(a)] = new Element(a);
        }
        else
        {
            elements[HashFunc(a)].AddElement(a);
        }
    }

    public void Delete(int a)
    {
        if (elements[HashFunc(a)] != null)
        {
            if (elements[HashFunc(a)].getNextElementKey(a) == true)
            {
                if (elements[HashFunc(a)].getNextElement() == false)
                {
                    elements[HashFunc(a)] = null;
                }
                else
                {
                    elements[HashFunc(a)] = elements[HashFunc(a)].getNextLineElement();
                }
            }
            else
            {
                elements[HashFunc(a)].DelElement(a);
            }
        }
    }

    public boolean getElement(int a)
    {
        return elements[HashFunc(a)].getElement(a);
    }
}
