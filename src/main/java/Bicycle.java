public class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int Startspeed, int startGear) {
        gear = startGear;
        speed = Startspeed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applybreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
      }
}

