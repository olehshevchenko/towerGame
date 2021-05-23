package Oleh.Shevchenko;

public class Tower extends GameUnit{
    public Tower(int enterFieldPositionX, int enterFieldPositionY) {
        super(enterFieldPositionX, enterFieldPositionY);
        System.out.println("Game Position:  " + getEnterFieldPositionX() + ":" + getEnterFieldPositionY());
    }

    protected void actions() {
        System.out.println("Doing nothing and immortal");
    }
}
