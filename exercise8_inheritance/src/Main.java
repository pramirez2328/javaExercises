import Cars.Mustang;
import Cars.Sonata;
import CarsView.CarView;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Sonata sonata = new Sonata();
    Mustang mustang = new Mustang();
    System.out.println("There are " + mustang.getNumberOfCarsAvailable() + " " + mustang.getBrand() + " available");
    System.out.println("There are " + sonata.getNumberOfCarsAvailable() + " " + sonata.getBrand() + " available");
    CarView sonataView = new CarView(sonata);
    CarView mustangView = new CarView(mustang);

    sonataView.printCarInformation();
    System.out.println("--------------");
    mustangView.printCarInformation();

    mustang.buyCar();
    sonata.buyCar();

    System.out.println("There are " + mustang.getNumberOfCarsAvailable() + " " + mustang.getBrand() + " available");
    System.out.println("There are " + sonata.getNumberOfCarsAvailable() + " " + sonata.getBrand() + " available");

}
