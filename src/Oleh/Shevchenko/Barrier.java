package Oleh.Shevchenko;

public class Barrier extends GameUnit{
    public Barrier(int gamePositionX, int gamePositionY) {
        super(gamePositionX, gamePositionY);
        System.out.println("Game Position:  " + getEnterFieldPositionX() + ":" + getEnterFieldPositionY());
    }

    protected void actions() {
        System.out.println("Doing nothing, can be destroyed");
    }
}
