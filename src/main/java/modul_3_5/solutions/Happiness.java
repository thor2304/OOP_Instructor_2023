package modul_3_5.solutions;

public class Happiness {
    static final int ITEM_PRICE = 6000;
    static final int ITEM_COUNT = 15;
    static final int HOUSE_VALUE = 8000;
    static int account = 30000;
    static boolean ownsHouse = true;

    static boolean accountIsPositive() {
        return account > 0;
    }

    /**
     * Refactored to work slightly differently
     * @param price the price of the item
     * @return true if the item was bought successfully, false if the account does not have enough to buy the item
     */
    static boolean buyItem(int price) {
        if (account >= price){
            account -= price;
            return true;
        }
        return false;
    }

    /**
     * Previously:<br>
     * returns true if able to sell house or no sale necessary.<br>
     * Now: <br>
     * returns true if the house was sold, false if it was not
     *
     */
    static boolean sellHouseIfNecessary(int itemPrice) {
        if (account <= itemPrice) { // We want the account to be positive after buying the item.
            // Therefore, we should sell the house, even if we have the money to buy the item
            if (!ownsHouse){
                return false;
            }
            account += HOUSE_VALUE;
            ownsHouse = false;
            return true;
        }
        return false;
    }

    static void printState() {
        System.out.println("account=" + account + " ownsHouse=" + ownsHouse);
    }

    public static void main(String[] args) {
        for (int i = 0; i < ITEM_COUNT; i++) {
            sellHouseIfNecessary(ITEM_PRICE);

            boolean hasBoughtItemThisIteration = buyItem(ITEM_PRICE);

            boolean happy = (accountIsPositive() && hasBoughtItemThisIteration);
            System.out.println("I am " + (happy ? "" : "not ") + "happy and my account is " + account);
            System.out.print("");
        }
    }
}
