public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String mark, String model, int yearOfManufacture, int numberOfDoors) {
        super(mark, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void getDescription() {
        System.out.println("Марка: " + getMark() + " Модель: " + getModel() + " Год: " + getYearOfManufacture() +
                " количество дверей: " + getNumberOfDoors());
    }
}
