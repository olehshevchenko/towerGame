package Oleh.Shevchenko;

public class Soldier extends GameUnit{
    public Soldier(int enterFieldPositionX, int enterFieldPositionY) {
        super(enterFieldPositionX, enterFieldPositionY);
        System.out.println("Game Position:  " + getEnterFieldPositionX() + ":" + getEnterFieldPositionY());
    }

    protected void move() {
        System.out.println("move to right after left");
    }
    protected void fire() {
        System.out.println("pew-pew");
    }
}
