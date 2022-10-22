package ru.mirea.prk13.z4;

public class Main {
    public static void main(String[] args)
    {
        Shirt[] shirts = new Shirt[11];
        shirts[0] = new Shirt("S001,Black Polo Shirt,Black,XL");
        shirts[1] = new Shirt("S002,Black Polo Shirt,Black,L");
        shirts[2] = new Shirt("S003,Blue Polo Shirt,Blue,XL");
        shirts[3] = new Shirt("S004,Blue Polo Shirt,Blue,M");
        shirts[4] = new Shirt("S005,Tan Polo Shirt,Tan,XL");
        shirts[5] = new Shirt("S006,Black T-Shirt,Black,XL");
        shirts[6] = new Shirt("S007,White TShirt,White,XL");
        shirts[7] = new Shirt("S008,White T-Shirt,White,L");
        shirts[8] = new Shirt("S009,Green T-Shirt,Green,S");
        shirts[9] = new Shirt("S010,Orange T-Shirt,Orange,S");
        shirts[10] = new Shirt("S011,Maroon Polo Shirt,Maroon,S");
        Shirt B = new Shirt(shirts[0].getString()+"\n"+shirts[1].getString()+"\n"+shirts[2].getString()+"\n"+shirts[3].getString()+"\n"+shirts[4].getString()+"\n"+shirts[5].getString()+"\n"+shirts[6].getString()+"\n"+shirts[7].getString()+"\n"+shirts[8].getString()+"\n"+shirts[9].getString()+"\n"+shirts[10].getString()+"\n");
        System.out.println(B.getString());
    }
}
