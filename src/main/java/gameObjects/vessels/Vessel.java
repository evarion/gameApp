package gameObjects.vessels;

abstract class Vessel {
    String name = "";
    String typeShip = "";
    String flagShip = "";

    int maxSpeed = 0;
    int currentSpeed = 0;
    int defender = 0;
    int maxGun = 0;
    int currentGun = 0;
    int maxCargoWeight = 0;
    int currentCargoWeight = 0;
    int crew = 0;

    int[] cargo = new int[90];

    public abstract void move();
    public abstract void fight();
    public abstract void drown();
    public abstract void boarding();
    public abstract void repair();
    public abstract void trading();

}
