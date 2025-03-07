public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();

    }
    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
