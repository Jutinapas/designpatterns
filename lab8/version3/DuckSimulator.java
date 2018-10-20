package lab8.version3;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoingDuckFactory = new EchoingDuckFactory();

        simulator.simulate(duckFactory);
        System.out.println();
        simulator.simulate(countingDuckFactory);
        System.out.println();
        simulator.simulate(echoingDuckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}
