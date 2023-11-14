package org.example;

public class Income extends Transaction{

    public Income(String id, String date, double amount, EIncomeCategory category) {
        super(id, date, amount);
        this.category = category;
    }


    public EIncomeCategory getCategory() {
        return category;
    }


    public void setCategory(EIncomeCategory category) {

                this.category = EIncomeCategory.PAYCHECK;
                //System.out.println("If press save ");

    }

    private EIncomeCategory category;
    public Income(String id, String date, double amount){
        super(id, date, amount);
    }


}
