package lab8.version4;

public class EchoingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }

}
