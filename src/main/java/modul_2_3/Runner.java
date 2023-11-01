package modul_2_3;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new FoodItem("Milk", 1.99, new Date(2020, 11, 1)));
        inventory.addItem(new FoodItem("Bread", 2.99, new Date(2020, 11, 2)));

        String[] materials = {"Wood", "Metal"};
        inventory.addItem(new NonFoodItem("Chair", 99.99, materials));
        inventory.addItem(new NonFoodItem("Table", 199.99, materials));

        inventory.printInventory();
        System.out.println("Total value: " + inventory.getInventoryValue());

    }
}
