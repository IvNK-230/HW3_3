public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        double month = percent / (100 * 12);

        int payment = service.calculate(12,sum,month);
        System.out.println();
        System.out.println(payment);

        payment = service.calculate(24,sum,month);
        System.out.println();
        System.out.println(payment);

        payment = service.calculate(36,sum,month);
        System.out.println();
        System.out.println(payment);
}
}
