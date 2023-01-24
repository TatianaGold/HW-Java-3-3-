public class CreditPaymentService {
    public int calculate (int creditAmount, int period) {
        double percent = (9.99 / 100) / 12;
        double months = period * 12;
        double interestRate = Math.pow((1+percent), months);
        double annuityRatio = percent * interestRate / (interestRate - 1);

        int result = (int) (creditAmount * annuityRatio);
        return result;
    }
}
