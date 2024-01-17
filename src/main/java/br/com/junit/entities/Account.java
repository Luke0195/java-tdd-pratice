package br.com.junit.entities;


import java.util.Objects;

public class Account {

    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private Long id;
    private Double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        if(amount > 0) {
            amount-= amount * DEPOSIT_FEE_PERCENTAGE;
            this.balance+= amount;
        }
    }

    public void withdraw(Double amount){
        if(amount > this.balance) throw new IllegalArgumentException();
        this.balance-= amount;
    }

    public double fullWithdraw(double amount){
        double x = balance;
        this.balance = 0.0;
        return x;
    }

    public void validateFields(Long id, Double balance) throws IllegalArgumentException{
        Object[] requiredFields = new Object[] { id, balance };
        for(Object field: requiredFields){
            if(Objects.isNull(field)) throw new IllegalArgumentException();
        }
    }

}
