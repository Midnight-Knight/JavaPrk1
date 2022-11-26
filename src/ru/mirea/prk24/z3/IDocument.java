package ru.mirea.prk24.z3;

public abstract class IDocument {
    public abstract String getName();
    public abstract String getType();
    public abstract String getData();

    @Override
    public String toString(){
        return "Type = "+this.getType()+", Name File = "+this.getName()+", Data = "+this.getData();
    }
}
