package tests.entities;

import br.com.junit.entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factories.AccountFactory;
// Nomeclatura de testes no java <Ação> should <Efeito> [when <Cenário>]
// Padrão AAA
// Arange - Instancie os objetos necessários
// Act - execute as ações necessárias
// Assert - declare o que deveria acontecer (resultado esperado).

// Unitário testa um funcionalidade isolada.
// Integração - Testa a comunicação entre os componentes.
// Funcional - Determinada funcionalidade.

class AccountTests {
    @Test
    void depositShouldIncreaseBalanceWhenAValidAmountIsProvided(){
        double amount = 200.00;
        double expectedValue = 196.00;
        Account account = AccountFactory.makeAccountWithNoParams();
        account.deposit(amount);
        Assertions.assertEquals(expectedValue, account.getBalance());
    }
    @Test
    void depositShouldDoNothingIfAmountEqualsToZeroOrNegativeAmount(){
        Long id = 1L;
        double amount = 200.00;
        double expectedValue = 200.00;
        Account account = AccountFactory.makeAccountParams(id, amount);
        account.deposit(0.0);
        Assertions.assertEquals(expectedValue, account.getBalance());
    }



}
