// 6510405521 Thatpong Wongchaita

public class QuackAdaptor implements Quackable {

    private NotDuck notDuck;

    public QuackAdaptor(NotDuck notDuck) {
        this.notDuck = notDuck;
    }

    public String quack() {
        String output = this.notDuck.say();
        return output;
    }
    
}
