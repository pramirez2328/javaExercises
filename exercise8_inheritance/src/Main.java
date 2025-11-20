import Cars.Mustang;
import Cars.Sonata;
import CarsView.CarView;
import Inventory.CarInventory;

void main() {
    CarInventory inventory = new CarInventory();
    inventory.welcomeMessage();

    Sonata sonata = new Sonata();
    Mustang mustang = new Mustang();

    // Initialize inventory
    inventory.addStock("Mustang", 0);
    inventory.addStock("Sonata", 1);

    System.out.println("There are " + inventory.getStock("Mustang") + " " + mustang.getBrand() + " available");
    System.out.println("There are " + inventory.getStock("Sonata") + " " + sonata.getBrand() + " available");

    CarView sonataView = new CarView(sonata);
    CarView mustangView = new CarView(mustang);

    sonataView.printCarInformation();
    System.out.println("--------------");
    mustangView.printCarInformation();
    System.out.println("--------------");

    // Buy cars
    if (inventory.buyCar("Mustang")) {
        mustangView.messageAfterBuyingACar();
    } else {
        mustangView.messageIfCarIsNotAvailable();
    }

    if (inventory.buyCar("Sonata")) {
        sonataView.messageAfterBuyingACar();
    } else {
        sonataView.messageIfCarIsNotAvailable();
    }

    System.out.println("--------------");
    System.out.println("There are " + inventory.getStock("Mustang") + " " + mustang.getBrand() + " available");
    System.out.println("There are " + inventory.getStock("Sonata") + " " + sonata.getBrand() + " available");
}
