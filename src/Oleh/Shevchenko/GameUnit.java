package Oleh.Shevchenko;

public class GameUnit {
    protected void actions() {
    }
    protected void move() {
    }
    protected void fire() {
    }
    protected void reload () {
    }
    protected int EnterFieldPositionX;
    protected int EnterFieldPositionY;

    public GameUnit(int enterFieldPositionX, int enterFieldPositionY) {
        EnterFieldPositionX = enterFieldPositionX;
        EnterFieldPositionY = enterFieldPositionY;
    }

    public int getEnterFieldPositionX() {
        return EnterFieldPositionX;
    }

    public int getEnterFieldPositionY() {
        return EnterFieldPositionY;
    }

    @Override
    public String toString() {
        return "GameUnit{" +
                "EnterFieldPositionX=" + EnterFieldPositionX +
                ", EnterFieldPositionY=" + EnterFieldPositionY +
                '}';
    }
}
