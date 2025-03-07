//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallarDuck md = new MallarDuck();
        RedHeadDuck rd = new RedHeadDuck();
        RubberDuck rub = new RubberDuck();

        System.out.println("-------");
        md.display();
        md.performQuack();
        md.performSwim();
        System.out.println("-------");

        System.out.println("-------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        System.out.println("-------");

        System.out.println("-------");
        rub.display();
        rub.performQuack();
        rub.performSwim();
        System.out.println("-------");
    }
}