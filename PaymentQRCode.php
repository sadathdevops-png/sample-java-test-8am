<?php
class PaymentQRCode {
    private $payerName;
    private $payeeName;
    private $amount;
    private $currency;
    private $transactionId;

    public function __construct($payerName, $payeeName, $amount, $currency, $transactionId) {
        $this->payerName = $payerName;
        $this->payeeName = $payeeName;
        $this->amount = $amount;
        $this->currency = $currency;
        $this->transactionId = $transactionId;
    }

    public function generateQRCodeData() {
        // Simulate QR code data string
        return sprintf(
            "PAYMENT|%s|%s|%.2f|%s|%s",
            $this->payerName,
            $this->payeeName,
            $this->amount,
            $this->currency,
            $this->transactionId
        );
    }

    // Getters and setters
    public function getPayerName() { return $this->payerName; }
    public function setPayerName($payerName) { $this->payerName = $payerName; }

    public function getPayeeName() { return $this->payeeName; }
    public function setPayeeName($payeeName) { $this->payeeName = $payeeName; }

    public function getAmount() { return $this->amount; }
    public function setAmount($amount) { $this->amount = $amount; }

    public function getCurrency() { return $this->currency; }
    public function setCurrency($currency) { $this->currency = $currency; }

    public function getTransactionId() { return $this->transactionId; }
    public function setTransactionId($transactionId) { $this->transactionId = $transactionId; }
}

// Example usage
$payment = new PaymentQRCode("Alice", "Bob", 100.00, "USD", "TXN123456");
echo $payment->generateQRCodeData();
?>