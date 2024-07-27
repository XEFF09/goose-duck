// 6510405521 Thatpong Wongchaita

public class QuackCounter implements Quackable {
    
    private Quackable quackable;
    private static int numOfQuacks = 0;
    private static int numOfPolites = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public String quack() {
        this.quackable.quack();
        
        if (this.quackable instanceof PoliteDecorator) {
            numOfPolites++;
        } else {
            numOfQuacks++;
        }

        return "";
    }

    public static int getNumOfQuacks() {
        return numOfQuacks;
    }

    public static int getNumOfPolites() {
        return numOfPolites;
    }
    
}
