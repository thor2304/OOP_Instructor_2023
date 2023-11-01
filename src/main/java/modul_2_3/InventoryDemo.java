package modul_2_3;

import java.util.ArrayList;
import java.util.Date;

public class InventoryDemo {
    private ArrayList<Item> items;

    public InventoryDemo() {
        items = new ArrayList<>();
    }

    public void addItem(Item itemToAdd){
        items.add(itemToAdd);
    }

    public void removeItem(Item itemToRemove){
        items.remove(itemToRemove);
    }

    public double getInventoryValue(){
        double sum = 0;

        // Løbe items igennem
        for (int i = 0; i < items.size(); i++){
            Item myItem = items.get(i);
            sum += myItem.getPrice();
        }
        // Printe en samlet sum
        return sum;
    }


    public void printInventory(){
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }


    public static void main(String[] args) {
        InventoryDemo demo = new InventoryDemo();
        demo.addItem(new FoodItem("Milk", 2.99, new Date()));
        demo.addItem(new FoodItem("Juice", 3.99, new Date()));

        System.out.println(demo.getInventoryValue());
        demo.printInventory();
    }
}
