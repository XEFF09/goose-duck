// 6510405521 Thatpong Wongchaita

public class DuckSimulator {
    public static void main(String[] args) throws Exception {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingPoliteDuckFactory = new CountingPoliteDuckFactory();

        simulator.simulate(duckFactory);
        simulator.simulate(countingDuckFactory);
        simulator.simulate(countingPoliteDuckFactory);
    }

    void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();

        Quackable goose = factory.createGoose();
        Quackable pigeon = factory.createPigeon(3);
        
        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);
        flock2.add(pigeon);

        System.out.println("\nDuck Simulator");

        simulate(flock1);
        simulate(flock2);

        System.out.println("Number of Quacks = " + QuackCounter.getNumOfQuacks());
        System.out.println("Number of PoliteQuacks = " + QuackCounter.getNumOfPolites());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
