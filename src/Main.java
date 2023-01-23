public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int period = 1;
        int payment = service.calculate(amount, period);

        System.out.println("Сумма кредита = " + amount);
        System.out.println("Срок кредита = " + period);
        System.out.println("Ежемесячный платеж = " + payment);
    }
}