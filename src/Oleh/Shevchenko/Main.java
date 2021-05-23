package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
    Barrier barrier = new Barrier(1, 5);
    barrier.actions();
        System.out.println("================");
    Soldier soldier = new Soldier(2, 8);
    soldier.move();
    soldier.fire();
        System.out.println("================");
    Tower tower = new Tower(9, 10);
    tower.actions();
        System.out.println("================");
    Tank tank = new Tank(5, 5);
    tank.move();
    tank.fire();
    tank.reload();
    }
}
