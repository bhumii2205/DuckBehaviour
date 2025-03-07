public abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;

    abstract public void display();

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }

    public void performQuack() {
        quackBehaviour.Quack();
    }
    public void performSwim() {
        swimBehaviour.Swim();
    }
}
