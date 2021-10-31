public class Main {
    public static void main(String[] args) {

        int balanceCurrent = 100;
        int payment = 20000;
        int bonus;
        if (payment > 1000) {
            bonus = (payment / 100);
        } else {
            bonus = 0;
        }

        int balanceAfterPayment = balanceCurrent + payment + bonus;
        System.out.println("Your balance now is " + balanceAfterPayment);
        System.out.println("Your bonus is " + bonus);
    }
}