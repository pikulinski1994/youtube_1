public class InheritanceDemo {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,10,5);
        System.out.println("Gear is : " + mountainBike.gear);
        System.out.println("SeatHeight : " + mountainBike.seatHeight);
        System.out.println("Bikespeed  is : " + mountainBike.speed);

        mountainBike.applybreak(3);
        System.out.println("Bikespeed is : " + mountainBike.speed);
    }
}
