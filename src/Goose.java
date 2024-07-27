// 6510405521 Thatpong Wongchaita

public class Goose implements NotDuck {

    public void honk() {
        System.out.println("Honk");
    }

    public String say() {
        this.honk();
        return "Honk";
    }
}
