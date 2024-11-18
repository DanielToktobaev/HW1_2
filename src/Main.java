public class Main {
    public static void main(String[] args) {
        Mother Mary = new Mother("Mary", 35, Professon.MEDIC, 150);
        System.out.println(Mary.getInfo());
        Mary.hobby();

        System.out.println("------------------------------");
        Son Mike = new Son("Mike", 15, Professon.POLICEMAN, 170, "White");
        System.out.println(Mike.getInfo());
        Mike.hobby();

        System.out.println("------------------------------");
        Son Gary = new Son("Gary", 20, Professon.JUDGE, 180, "White");
        System.out.println(Gary.getInfo());
        Gary.hobby();
    }
}
