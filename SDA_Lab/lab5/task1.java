package lab5;

public class task1 {
    class Order {

        Customer c = new Customer();
        Payment p = new Payment();
        database d = new database();
        email e = new email();
        inventory i = new inventory();

        void placeOrder() {
            c.saveOrder();
            p.porceedpayment();
            d.updateStock();
            e.sendConfirmation();
            i.invectory();
        }
    }

    class Customer {
        void saveOrder() {
            System.out.println("order saved");
        }
    }

    class Payment {
        void porceedpayment() {
            System.out.println("payment done");
        }
    }

    class database {
        void updateStock() {
            System.out.println("data updated");
        }
    }

    class email {
        void sendConfirmation() {
            System.out.println("confimred");
        }
    }

    class inventory {
        void invectory() {
            System.out.println("data updated");
        }
    }

    void main(String argv[]) {
        Order o = new Order();
        o.placeOrder();
    }
}
