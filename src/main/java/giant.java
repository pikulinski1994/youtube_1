public class giant extends Bicycle {


    public giant(int Startspeed, int startGear) {
        super(Startspeed, startGear);
    }

    @Override
    public void setGear(int newValue) {
        gear = newValue+2;
    }
    @Override
    public void applybreak(int decrement) {
        speed = speed-decrement;
    }
    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
    }

    {





}

}






