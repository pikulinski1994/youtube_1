public class MountainBike extends Bicycle {

    public int seatHeight;


    public MountainBike(int startHeight, int Startspeed, int startGear) {
        super(Startspeed, startGear);
        this.seatHeight = startHeight;

    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

}
