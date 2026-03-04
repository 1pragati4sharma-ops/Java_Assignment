package Java_Assignment2.Mod4AdvJavaConcepts;



    interface PaymentClass {
        void pay(double amount);
    }

    class CreditCardPayment implements PaymentClass {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    class UPIPayment implements PaymentClass {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }
    class TestPayment {
        public static void main(String[] args) {
            PaymentClass p1 = new CreditCardPayment();
            PaymentClass p2 = new UPIPayment();

            p1.pay(2000);
            p2.pay(250);
        }
    }


