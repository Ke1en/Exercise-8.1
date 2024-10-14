public class Vehicle {
    private String mark;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String mark, String model, int yearOfManufacture) {
        this.mark = mark;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void getDescription() {
        System.out.println("Марка: " + getMark() + " Модель: " + getModel() + " Год: " + getYearOfManufacture());
    }
}
