public class PaymentQRCode {
    private String payerName;
    private String payeeName;
    private double amount;
    private String currency;
    private String transactionId;

    public PaymentQRCode(String payerName, String payeeName, double amount, String currency, String transactionId) {
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
        this.currency = currency;
        this.transactionId = transactionId;
    }

    public String generateQRCodeData() {
        // Simulate QR code data string
        return String.format("PAYMENT|%s|%s|%.2f|%s|%s",
                payerName, payeeName, amount, currency, transactionId);
    }

    // Getters and setters
    public String getPayerName() { return payerName; }
    public void setPayerName(String payerName) { this.payerName = payerName; }

    public String getPayeeName() { return payeeName; }
    public void setPayeeName(String payeeName) { this.payeeName = payeeName; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
}