import javax.swing.*;

public class Mother extends Grandfather {
    private final int height;
    private final int age;
    private final Professon profession;


    public Mother(String name, int age, Professon professon, int height) {
        super(name, age, professon);
        this.height = height;
        this.age = age;
        this.profession = professon;
    }


    public int getHeight() {
        return height;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Professon getProfession() {
        return profession;
    }

    public String getInfo() {
        return  "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nHeigth: " + getHeight() +
                "\nProfession" + getProfesson();
    }

    public void hobby() {
        System.out.println("Cooking");
    }
}
