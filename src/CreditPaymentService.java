public class CreditPaymentService {
    public int calculate(int a, int b, double c) {
        double payment;
        payment = b * (c * (Math.pow((1+c),a))) / ((Math.pow((1+c),a)) - 1);
        return (int) payment;
    }
}
