package Oleh.Shevchenko;

public class Tank extends Soldier{
    public Tank(int enterFieldPositionX, int enterFieldPositionY) {
        super(enterFieldPositionX, enterFieldPositionY);
    }

    protected void reload() {
        System.out.println("10 second cannot shooting");
    }
}
