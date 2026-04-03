package com.example.demo;

public class PaymentDTO {
    private Double transferAmount;
    private String content;

    // Viết tay getter/setter để IntelliJ nó chịu hiểu
    public Double getTransferAmount() { return transferAmount; }
    public void setTransferAmount(Double transferAmount) { this.transferAmount = transferAmount; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}