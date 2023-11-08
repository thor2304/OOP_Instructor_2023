package modul_3_5.handouts;

public class Happiness {
    static final int ITEM_PRICE = 6000;
    static final int ITEM_COUNT = 15;
    static final int HOUSE_VALUE = 8000;
    static int account = 30000;
    static boolean ownsHouse = true;

    static boolean accountIsPositive() {
        return account > 0;
    }

    static boolean buyItem(int price) {
        account -= price;
        return accountIsPositive();
    }

    /**
     * returns true if able to sell house or no sale necessary
     */
    static boolean sellHouseIfNecessary() {
        if (!accountIsPositive()) {
            if (!ownsHouse) return false;
            account += HOUSE_VALUE;
            ownsHouse = false;
        }
        return true;
    }

    static void printState() {
        System.out.println("account=" + account + " ownsHouse=" + ownsHouse);
    }

    public static void main(String[] args) {
        boolean happy;
        for (int i = 0; i < ITEM_COUNT; i++) {
            happy = (accountIsPositive() && buyItem(ITEM_PRICE)) || sellHouseIfNecessary();
            System.out.println("I am " + (happy ? "" : "not ") + "happy and my account is " + account);
        }
    }
}
