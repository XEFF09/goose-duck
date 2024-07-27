// 6510405521 Thatpong Wongchaita

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
    public Quackable createGoose() {
        return new QuackAdaptor(new Goose());
    }
    public Quackable createPigeon(int cooCount) {
        return new QuackAdaptor(new Pigeon(cooCount));
    }
}
