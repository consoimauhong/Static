public class Student1 {
    public String name;
    public String classes;

    public Student1(){
        this.name = "John";
        this.classes = "C02";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public String display(){
        return "I'am " + this.name + " at " + this.classes;
    }
}
