package lab6;

public class task3 {
    interface delivery {
        void calcualate();
    }

    class Bike implements delivery {
        public void calcualate() {
            System.out.println("Delivery fee: Rs. 100");
        }
    }

    class Car implements delivery {
        public void calcualate() {
            System.out.println("Delivery fee: Rs. 200");
        }
    }

    class FoodOrder {

        delivery d;

        FoodOrder(delivery d) {
            this.d = d;
        }

        void printall() {
            d.calcualate();
        }

    }

    class save {
        public void saveOrder() {
            System.out.println("Order saved to database");
        }
    }

    class notification {
        public void sendNotification() {
            System.out.println("Order notification sent");
        }
    }

    class receipt {
        public void generateReceipt() {
            System.out.println("Receipt generated");
        }
    }

    public void main(String[] argv) {
        delivery d = new Car();
        FoodOrder f = new FoodOrder(d);
        f.printall();

    }
}
