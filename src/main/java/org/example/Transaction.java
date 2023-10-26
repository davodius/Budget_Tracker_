package org.example;

public class Transaction {

private String id;
private String date;
private double amount;

    public Transaction(String id, String date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}

