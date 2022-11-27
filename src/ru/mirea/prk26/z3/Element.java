package ru.mirea.prk26.z3;

public class Element {
    private int key;
    private Element element = null;

    public Element(int n)
    {
        key = n;
    }

    public boolean getElement(int n)
    {
        if (n == key)
        {
            return true;
        }
        else if(element != null)
        {
            return element.getElement(n);
        }
        else
        {
            return false;
        }
    }

    public boolean getNextElementKey(int n)
    {
        if (key == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean getNextElement()
    {
        if (element == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Element getNextLineElement()
    {
        return element;
    }

    public void DelElement(int n)
    {
        if (element.getNextElementKey(n) == true)
        {
            if(element.getNextElement() == false)
            {
                element = null;
            }
            else
            {
                element = element.getNextLineElement();
            }
        }
    }

    public void AddElement(int n)
    {
        if (element == null)
        {
            element = new Element(n);
        }
        else
        {
            element.AddElement(n);
        }
    }
}
