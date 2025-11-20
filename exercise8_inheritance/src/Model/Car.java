package Model;

public class Car {
    private final String brand;
    private final String model;
    private final String fuelType;
    private final double price;
    private final int year;
    private final String color;

    public Car(String brand, String model, String fuelType, double price, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.price = price;
        this.year = year;
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

}
