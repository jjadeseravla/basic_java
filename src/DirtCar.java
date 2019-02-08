public class DirtCar extends Car {
    //super referring to Car class ( parent class)

    int dirtyTerrainTopSpeed;

    public DirtCar(double mileage, int price, int doors, int dirtyTerrainTopSpeed) {
        super(mileage,price,doors); // super calling Car constructor
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    public int getDirtyTerrainTopSpeed() {
        return dirtyTerrainTopSpeed;
    }

    public void setDirtyTerrainTopSpeed(int dirtyTerrainTopSpeed) {
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    public String startDirtCar() {
        return "Dirt car status is: " + super.carStart();
    }
}
