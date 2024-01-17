package br.com.junit.application;

import br.com.junit.entities.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1L, 0.0);
        account.deposit(200.00);
        System.out.println(account.getBalance());
        account.withdraw(8.00);
        System.out.println(account.getBalance());
        Double value = 3.9;
        System.out.println(value instanceof  Object);
    }

}