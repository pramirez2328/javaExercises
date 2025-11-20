package Cars;

import Model.Car;

public class Mustang extends Car {
   private boolean isAvailable = true;
   private int numberOfCarsAvailable = 10;

   public Mustang() {
        super("Ford", "Mustang", "gasoline", 100_000, 2025, "black" );
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public int getNumberOfCarsAvailable() {
        return numberOfCarsAvailable;
    }

    public void buyCar() {
         if (isAvailable) {
            numberOfCarsAvailable--;
            isAvailable = numberOfCarsAvailable != 0;
        } else {
            System.out.println("Sorry, this car is not available");
        }
    }

}
