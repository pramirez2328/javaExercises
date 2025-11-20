package Model;

public class Car {
    private String brand;
    private String model;
    private  String fuelType;
    private double price;
    private int year;
    private String color;


    public Car() {
        System.out.println("A new car has been created");

    }

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
