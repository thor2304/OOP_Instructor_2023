package modul_2_1;

public class Runner {
    public static void main(String[] args) {
//        kunder();
        kundeDatabase();
    }

    static void kunder(){
        Customer aCustomer = new Customer("John", 1, 100.0);
        Customer bCustomer = new Customer("Peter", 1, 100.0);

        aCustomer.deposit(50.0);
        aCustomer.withdraw(25.0);


        System.out.println("Balance: " + aCustomer.getBalance());
        System.out.println(aCustomer.getName());
        System.out.println(bCustomer.getName());
    }

    static void kundeDatabase(){
        CustomerDatabase database = new CustomerDatabase();

        database.addCustomer(new Customer("John", 1, 100.0));
        database.addCustomer(new Customer("Jane", 2, 200.0));
        database.addCustomer(new Customer("Jack", 3, 300.0));

        System.out.println("Printing all customers");
        database.printCustomerNames();

        System.out.println("Printing all customers manually");
        Customer[] customers = database.getCustomers();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

        System.out.println("Removing customer with id 2");
        database.removeCustomer(2);

        database.printCustomerNames();

        System.out.println("Printing all customers manually");
        for (int i = 0; i < database.getCustomers().length; i++) {
            System.out.println(database.getCustomers()[i]);
        }
    }
}
