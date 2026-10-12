package Encapsulation;

public class Student {
    private String name;
    private int age;
    private float marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid age!!Try again.");
        }
        else {
            this.age = age;
        }
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
