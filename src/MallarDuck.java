public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehaviour= new Quack();
        swimBehaviour = new SwimWithLegs();
    }
    @Override
    public void display() {
        System.out.println("Im Mallar Duck");
    }
}
