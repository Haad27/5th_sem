package lab6;

public class task1 {

    interface DeliveryFee {
        void calculateFee();
    }

    static class BikeDelivery implements DeliveryFee {
        public void calculateFee() {
            System.out.println("Delivery fee: Rs. 100");
        }
    }

    static class CarDelivery implements DeliveryFee {
        public void calculateFee() {
            System.out.println("Delivery fee: Rs. 200");
        }
    }

    static class VanDelivery implements DeliveryFee {
        public void calculateFee() {
            System.out.println("Delivery fee: Rs. 500");
        }
    }

    interface Notification {
        void send();
    }

    static class SMS implements Notification {
        public void send() {
            System.out.println("SMS sent");
        }
    }

    static class Email implements Notification {
        public void send() {
            System.out.println("Email sent");
        }
    }

    static class WhatsApp implements Notification {
        public void send() {
            System.out.println("WhatsApp sent");
        }
    }

    static class FoodOrder {
        DeliveryFee d;
        Notification n;

        FoodOrder(DeliveryFee d, Notification n) {
            this.d = d;
            this.n = n;
        }

        void print() {
            d.calculateFee();
            n.send();
        }
    }

    static class Database {
        void saveOrder() {
            System.out.println("Order saved to database");
        }
    }

    static class Receipt {
        void generateReceipt() {
            System.out.println("Receipt generated");
        }
    }

    public static void main(String[] args) {

        DeliveryFee d = new BikeDelivery();
        Notification n = new SMS();

        FoodOrder order = new FoodOrder(d, n);
        order.print();

        Database db = new Database();
        db.saveOrder();

        Receipt r = new Receipt();
        r.generateReceipt();
    }
}