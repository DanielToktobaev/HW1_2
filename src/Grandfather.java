public class Grandfather {
    private String name;
    private int age;
    private Professon professon;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Professon getProfesson() {
        return professon;
    }

    public Grandfather(String name, int age, Professon professon) {
        this.name = name;
        this.age = age;
        this.professon = professon;
    }
}
