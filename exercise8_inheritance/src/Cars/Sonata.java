package Cars;

import Model.Car;

public class Sonata extends Car {
    private boolean isAvailable = true;
    private int numberOfCarsAvailable = 7;

    public Sonata() {
        super("Ford", "Sonata", "gasoline", 70_000, 2022, "white");
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public int getNumberOfCarsAvailable() {
        return numberOfCarsAvailable;
    }

    public void buyCar() {
        if(isAvailable) {
            numberOfCarsAvailable--;
            isAvailable = numberOfCarsAvailable != 0;
        } else {
            System.out.println("Sorry, this car is not available");
        }
    }
}
