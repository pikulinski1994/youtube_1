public class Highschool {

    public static void main(String[] args) {

        Student pawel = new Student("Pawel",12,"ksiecia Janusza");

        System.out.println(pawel.getName());
        System.out.println(pawel.getAge());
        System.out.println(pawel.getAddress());

        pawel.setName("Grzegorz");

        System.out.println(pawel.getName());
    }



    }

