public class PaymentDemo {
    public static void main(String[] args) {
        // Create a payment
        PaymentQRCode payment = new PaymentQRCode(
            "Sadath",        // payer name
            "Online Store",  // payee name
            49.99,           // amount
            "USD",           // currency
            "TXN123456"      // transaction ID
        );

        // Generate QR code data (simulated)
        String qrCodeData = payment.generateQRCodeData();

        // Display the QR code data
        System.out.println("Scan this QR code to pay:");
        System.out.println(qrCodeData);
    }
}