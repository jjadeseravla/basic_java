import java.sql.SQLOutput;

public class HelloSample {
//
//    public static void main(String[] args) {
//
//        //System.out.println("work");
//        int sum;
//        sum = 50/6;
//        System.out.println(sum);
//    }


//        public static void main(String[] args) {
//            double USdollars = 50d;
//            double bPounds = USdollars * 0.81d;
//
//            System.out.println("50 USD in bp is " + bPounds);
//        }

    public static void main(String[] args) {
//        Car benz = new Car(10.25, 35000, 3);
//        benz.mileage = 10.54;
//        benz.price = 30000;
//        benz.doors = 4;
//        Car audi = new Car();
        DirtCar dirtyBenz = new DirtCar(20.5, 500000, 6, 50);

//        dirtyBenz.setMileage(6);
//        dirtyBenz.setDoors(2);
//        dirtyBenz.setPrice(250000);
//        dirtyBenz.setDirtyTerrainTopSpeed(45);

        System.out.println("dirty car has " + dirtyBenz.getMileage() + " miles");
        System.out.println(dirtyBenz.getDoors() + " doors");
        System.out.println("$" + dirtyBenz.getPrice());
        System.out.println(dirtyBenz.getDirtyTerrainTopSpeed() + " terrain top speed");

        //System.out.println("normal benz have mileage: " + benz.getMileage());

        System.out.println(dirtyBenz.startDirtCar());
    }

}
