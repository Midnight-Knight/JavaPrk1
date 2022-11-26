package ru.mirea.prk24.z3;

public class MusicDocument extends IDocument{
    private String type;
    private String name;
    private String data;
    public MusicDocument(String type, String name, String data){
        this.type=type;
        this.name=name;
        this.data=data;
    }
    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getData() {
        return this.data;
    }
}
