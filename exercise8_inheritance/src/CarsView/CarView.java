package CarsView;

import Model.Car;

;

public class CarView {
    Car car;

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

    public void messageAFterBuyingACar() {
        System.out.println("Thank you for buying " + car.getModel());
    }

    public void messageIfCarIsNotAvailable() {
        System.out.println("Sorry, this car is not available");
    }

    public void messageIfCarIsAvailable() {
        System.out.println("This car is available");
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the car shop!");
    }

}
