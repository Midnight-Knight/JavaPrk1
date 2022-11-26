package ru.mirea.prk24.z3;

public class ICreateDocument{
    public static IDocument getComputer(String type, String name, String data)
    {
        if("TextDocument".equalsIgnoreCase(type))
        {
            return new TextDocument(type, name, data);
        }
        else if("ImageDocument".equalsIgnoreCase(type))
        {
            return new ImageDocument(type, name, data);
        }
        else if("MusicDocument".equalsIgnoreCase(type))
        {
            return new MusicDocument(type, name, data);
        }
        return null;
    }
}
