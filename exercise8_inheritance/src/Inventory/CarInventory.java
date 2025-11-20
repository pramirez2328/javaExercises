package Inventory;

import java.util.HashMap;
import java.util.Map;

public class CarInventory {
    private final Map<String, Integer> stock;

    public CarInventory() {
        this.stock = new HashMap<>();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the car shop!");
    }

    public void addStock(String carModel, int quantity) {
        stock.put(carModel, stock.getOrDefault(carModel, 4) + quantity);
    }

    public boolean isAvailable(String carModel) {
        return stock.getOrDefault(carModel, 0) > 0;
    }

    public int getStock(String carModel) {
        return stock.getOrDefault(carModel, 0);
    }

    public boolean buyCar(String carModel) {
        if (isAvailable(carModel)) {
            stock.put(carModel, stock.get(carModel) - 1);
            return true;
        }
        return false;
    }
}

