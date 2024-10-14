public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String mark, String model, int yearOfManufacture, boolean hasSidecar) {
        super(mark, model, yearOfManufacture);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void getDescription() {
        if(!hasSidecar)
            System.out.println("Марка: " + getMark() + " Модель: " + getModel() + " Год: " + getYearOfManufacture() +
                " без коляски");
        else
            System.out.println("Марка: " + getMark() + " Модель: " + getModel() + " Год: " + getYearOfManufacture() +
                    " с коляской");
    }
}
