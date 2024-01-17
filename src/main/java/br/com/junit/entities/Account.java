package br.com.junit.entities;


public class Account {

    private Long id;
    private Double balance;

    public Account(){};

    public Account(Long id, Double balance){
        this.id = id;
        this.balance = balance;
    }
}
