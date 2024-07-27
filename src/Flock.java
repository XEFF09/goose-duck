// 6510405521 Thatpong Wongchaita

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }

    public String quack() {
        System.out.println("---- Flock ----");
        boolean isFirst = true;
        for (Quackable quacker : quackers) {
            if (isFirst) {
                System.out.println("#H");
                quacker.quack();
                quacker.quack();
                quacker.quack();
                System.out.println("#H");
                isFirst = false;
            } else {
                quacker.quack();
            }
        }
        return "";
    }

}
