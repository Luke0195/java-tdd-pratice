package tests.factories;

import br.com.junit.entities.Account;

public final  class AccountFactory {

    private AccountFactory(){}

    public static Account makeAccountWithNoParams(){
        return new Account(1L, 0.0);
    };

    public static Account makeAccountWithAmount(Double amount){
        return new Account(1L, amount);
    }
}
