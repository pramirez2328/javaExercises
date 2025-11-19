package Model;

public class Car {
    private String brand;
    private String model;
    private  String fuelType;
    private int carCount = 0;

    public Car() {
        System.out.println("A new car has been created");
        carCount++;
    }

    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCarCount() {
        return carCount;
    }

}
