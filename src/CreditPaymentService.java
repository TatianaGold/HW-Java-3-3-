public class CreditPaymentService {
    public int calculate (int a, int b) {
        double percent = (9.99 / 100) / 12;
        double m = b * 12;
        double y = Math.pow((1+percent), m);
        double k = percent * y / (y - 1);

        int result = (int) (a * k);
        return result;
    }
}
