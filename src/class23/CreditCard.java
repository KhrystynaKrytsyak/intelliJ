package class23;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will
    // calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;

    void Interest(double interest, double balance) {
        this.balance = balance;
        this.interest = interest;
        System.out.println("Based on your balance your interest is " + balance * (interest / 100));
    }
}
    class Visa extends CreditCard {
    }

    class AX extends CreditCard {
        void Interest(double interest, double balance) {
            this.balance = balance;
            this.interest = interest;
            System.out.println("The interest on you AX card is " + balance * (interest / 100));
        }

        public static void main(String[] args) {
            CreditCard cc = new CreditCard();
            cc.Interest(4.00, 25000);

            Visa visa = new Visa();
            visa.Interest(1.50, 5000);

            AX ax = new AX();
            ax.Interest(3.00, 6000);
        }
    }

