package com.example.restexceptionsovet;

public class PaymentDetails {
    //PaymentDetails — это просто класс модели, описывающий тело HTTP-ответа,
    //который действие контроллера будет передавать в случае успешного платежа.
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
