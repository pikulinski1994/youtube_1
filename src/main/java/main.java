public class main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(10,1);
        System.out.println("Bicycle gear is : " + bicycle.gear );
        System.out.println("Bicycle speed is : " + bicycle.speed);

        bicycle.applybreak(2);
        System.out.println("Bicycle speed after break is : " + bicycle.speed);

        bicycle.speedUp(10);
        System.out.println("Bicycle speed is : " + bicycle.speed);

        giant giant1 = new giant(14,2);
        System.out.println("Giant gear is : " + giant1.gear);
        System.out.println("Giant speed is : " + giant1.speed);

        giant1.speedUp(2);
        System.out.println("Giant new speed is : " + giant1.speed);
        giant1.setGear(5);

        giant1.applybreak(5);
        System.out.println("new speed of giant after break is :" + giant1.speed);



    }
}
