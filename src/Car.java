public class Car {

    private double mileage;
    private int price;
    private int doors;

//    public Car() {
//        this.mileage = 5.23;
//        this.price = 50000;
//        this.doors = 5;
//    }
//
//    //constructors - special  method implicitly called and creates objects
    public Car(double mileage, int price, int doors) {
        this.mileage = mileage; //set class' field - mileage to be equal to mileage from the method
        this.price = price;
        this.doors = doors;
    }

    //setter for Mileage field and void method does not return anything
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //getter for Mileage field
    public double getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String carStart() {
        return "Car started";
    }

    public void carShutOff() {
        System.out.println("car engine off");
    }
}
