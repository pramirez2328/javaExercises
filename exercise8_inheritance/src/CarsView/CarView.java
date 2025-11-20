package CarsView;

import Model.Car;

public class CarView {
    private final Car car;

    public CarView(Car car) {
        this.car = car;
    }

    public void printCarInformation() {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Fuel type: " + car.getFuelType());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }

    public void messageAfterBuyingACar() {
        System.out.println("Thank you for buying " + car.getModel());
    }

    public void messageIfCarIsNotAvailable() {
        System.out.println("Sorry, the " + car.getModel() + " is not available");
    }

    public void messageIfCarIsAvailable() {
        System.out.println("The " + car.getModel() + " is available");
    }
}
