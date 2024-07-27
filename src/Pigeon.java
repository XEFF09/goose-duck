// 6510405521 Thatpong Wongchaita

public class Pigeon implements NotDuck {

    private int cooCount = 0;

    public Pigeon(int cooCount) {
        this.cooCount = cooCount;
    }

    public void coo() {
        System.out.print("Coo");
    }

    public String say() {
        if (this.cooCount >= 2) {
            for (int i = 0; i < this.cooCount; i++) {
                this.coo();
            }
            System.out.println("");
            return "Coo".repeat(this.cooCount);
        }
        return "";
    }
    
}
