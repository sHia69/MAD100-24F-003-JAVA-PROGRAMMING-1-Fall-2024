package src;
public class Student {
    private String name;
    private int id;

    public String toString(){
        return this.name;
    }

    public Student (int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public void setId(int newId){
        id=newId;
    }
}