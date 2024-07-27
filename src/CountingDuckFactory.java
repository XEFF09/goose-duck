// 6510405521 Thatpong Wongchaita

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
    public Quackable createGoose() {
        return new QuackCounter(new QuackAdaptor(new Goose()));
    }
    public Quackable createPigeon(int cooCount) {
        return new QuackCounter(new QuackAdaptor(new Pigeon(cooCount)));
    }
    
}
