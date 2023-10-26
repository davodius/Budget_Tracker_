package org.example;

public class Income extends Transaction{

    public Income(){
        super("1", "26102023", "100");

    }

    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    private String date;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    private String amount;

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }





}
