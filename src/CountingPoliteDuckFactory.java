// 6510405521 Thatpong Wongchaita

public class CountingPoliteDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteDecorator(new MallardDuck()));
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new PoliteDecorator(new RedheadDuck()));
    }
    public Quackable createDuckCall() {
        return new QuackCounter(new PoliteDecorator(new DuckCall()));
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new PoliteDecorator(new RubberDuck()));
    }
    public Quackable createGoose() {
        return new QuackCounter(new PoliteDecorator(new QuackAdaptor(new Goose())));
    }
    public Quackable createPigeon(int cooCount) {
        return new QuackCounter(new PoliteDecorator(new QuackAdaptor(new Pigeon(cooCount))));
    }
}
