// 6510405521 Thatpong Wongchaita

public class PoliteDecorator implements Quackable {
    
    private Quackable quacker;

    public PoliteDecorator(Quackable quacker) {
        this.quacker = quacker;
    }

    public String quack() {
        String output = this.quacker.quack();
        int length = output.length();

        System.out.print("\033[1A");
        System.out.print("\033[" + (length) + "C");
        System.out.println(" krub");

        return "";
    }

}
