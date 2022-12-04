package ru.mirea.prk28AND29.z3;
import ru.mirea.prk28AND29.z2.Item;

public class List {
    private Element right;
    private Element left;

    public List(){}

    public void Add(Item element)
    {
        Element newElement = new Element(element);
        if (right == null)
        {
            right = newElement;
        }
        else
        {
            left.nextElement = newElement;
        }
        left = newElement;
        left.nextElement = right;
    }

    public void traverseList()
    {
        Element currentElement = right;
        if (right != null)
        {
            do{
                System.out.print(currentElement.element.getName() + " ");
                currentElement = currentElement.nextElement;
            }while(currentElement != right);
        }
    }

    public int traverseCost()
    {
        int buf = 0;
        Element currentElement = right;
        if (right != null)
        {
            do{
                buf += currentElement.element.getPrice();
                currentElement = currentElement.nextElement;
            }while(currentElement != right);
        }
        return buf;
    }

    public int traverseKolVo()
    {
        int buf = 0;
        Element currentElement = right;
        if (right != null)
        {
            do{
                ++buf;
                currentElement = currentElement.nextElement;
            }while(currentElement != right);
        }
        return buf;
    }

    public int SearchInt(String Name)
    {
        int buf = 0;
        Element currentElement = right;
        if (right != null)
        {
            do{
                if (currentElement.element.equals(Name) == true)
                {
                    ++buf;
                }
                currentElement = currentElement.nextElement;
            }while(currentElement != right);
        }
        return buf;
    }

    public String Search(String Name)
    {
        Element currentElement = right;
        if (right == null)
        {
            return "False";
        }
        else
        {
            do {
                if (currentElement.element.getName().equals(Name) == true)
                {
                    return "| Название: " + currentElement.element.getName() + " | Цена: " + currentElement.element.getPrice() + " | Описание: " + currentElement.element.getDescription() + " |";
                }
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return "False";
        }
    }

    public String Search(int pos)
    {
        int buf = 0;
        Element currentElement = right;
        if (right == null)
        {
            return "False";
        }
        else
        {
            do {
                if (buf == pos)
                {
                    return "| Название: " + currentElement.element.getName() + " | Цена: " + currentElement.element.getPrice() + " | Описание: " + currentElement.element.getDescription() + " |";
                }
                ++buf;
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return "False";
        }
    }

    public String SearchInt(int pos)
    {
        int buf = 0;
        Element currentElement = right;
        if (right == null)
        {
            return "False";
        }
        else
        {
            do {
                if (buf == pos)
                {
                    return currentElement.element.getName();
                }
                ++buf;
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return "False";
        }
    }

    public int SearchCost(int pos)
    {
        int buf = 0;
        Element currentElement = right;
        if (right == null)
        {
            return -1;
        }
        else
        {
            do {
                if (buf == pos)
                {
                    return currentElement.element.getPrice();
                }
                ++buf;
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return -1;
        }
    }

    public Item SearchItem(int pos)
    {
        int buf = 0;
        Element currentElement = right;
        if (right == null)
        {
            return null;
        }
        else
        {
            do {
                if (buf == pos)
                {
                    return currentElement.element;
                }
                ++buf;
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return null;
        }
    }

    public boolean SearchBol(String Name)
    {
        Element currentElement = right;
        if (right == null)
        {
            return false;
        }
        else
        {
            do {
                if (currentElement.element.getName().equals(Name) == true)
                {
                    return true;
                }
                currentElement = currentElement.nextElement;
            } while (currentElement != right);
            return false;
        }
    }

    public boolean delete(String Name)
    {
        Element currentElement = right;
        if (right == null)
        {
            return false;
        }
        do
        {
            Element nextElement = currentElement.nextElement;
            if (nextElement.element.getName().equals(Name) == true)
            {
                if(left == right)
                {
                    right = null;
                    left = null;
                }
                else
                {
                    currentElement.nextElement = nextElement.nextElement;
                    if (right == nextElement)
                    {
                        right = right.nextElement;
                    }
                    if (left == nextElement)
                    {
                        left = currentElement;
                    }
                }
                return true;
            }
            currentElement = nextElement;
        }while(currentElement != right);
        return false;
    }
}
