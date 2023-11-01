package modul_2_3;

import java.util.Date;

public class FoodItem extends Item{
    private Date expires;

    public FoodItem(String name, double price, Date expires) {
        super(name, price);
        this.expires = expires;
    }

    public Date getExpires() {
        return expires;
    }

    @Override
    public String toString() {
        return "FoodItem{" + super.toString() +
                "expires=" + expires +
                '}';
    }
}
