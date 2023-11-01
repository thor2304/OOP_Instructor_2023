package modul_2_1;

public class CustomerDatabase {
    Customer[] customers;

    public CustomerDatabase(){
        this.customers = new Customer[10];
    }

    public void addCustomer(Customer customer){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null){
                customers[i] = customer;
                return;
            }
        }
        throw new IllegalArgumentException("Database is full");
    }

    public Customer removeCustomer(int id){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].id == id){
                Customer out = customers[i];
                customers[i] = null;
                return out;
            }
        }
        return null;
    }

    public Customer[] getCustomers(){
        return customers.clone();
    }

    public void printCustomerNames(){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null){
                System.out.println(customers[i].name);
            }
        }
    }
}
