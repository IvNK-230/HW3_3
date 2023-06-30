public class CreditPaymentService {
    public int calculate(int month, int sum, double percent) {
        double payment;
        payment = sum * (percent * (Math.pow((1 + percent), month))) / ((Math.pow((1 + percent), month)) - 1);
        return (int) payment;
    }
}
