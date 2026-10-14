package humans;

public class Grandparent {
    private String name;
    private int age;

    private boolean hasSuperPower;

    public Grandparent(String name,int age){
        this.name=name;
        this.age=age;
        hasSuperPower=false;
        System.out.println("Grandparent constructor called.");
    }

    public boolean hasSuperPower(){
        return hasSuperPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
