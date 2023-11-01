package modul_2_3;

import java.util.ArrayList;
import java.util.Arrays;

public class NonFoodItem extends Item{
    private String[] materials;

    public NonFoodItem(String name, double price, String[] materials) {
        super(name, price);
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "NonFoodItem{" + super.toString() +
                "materials=" + Arrays.toString(materials) +
                '}';
    }
}
