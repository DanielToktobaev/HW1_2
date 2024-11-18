public final class Son extends Mother {
    private String color;

    public Son(String name, int age, Professon professon, int height, String color) {
        super(name, age, professon, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void hobby() {
        System.out.println("Gaming");
    }

    public String getInfo() {
        return super.getInfo() +
                "color: " + color;
    }
}