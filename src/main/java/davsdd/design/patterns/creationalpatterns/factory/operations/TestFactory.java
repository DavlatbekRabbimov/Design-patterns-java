package davsdd.design.patterns.creationalpatterns.factory;

import java.math.BigDecimal;

public class TestFactory {

    public static void main(String[] args) {

        Account davsdd = new Account(new BigDecimal("0.0"), "davsdd");
        getCurrentBalance(davsdd);

        OperationFactory factory = new OperationFactory();
        IOperation deposit = factory.createDeposit(davsdd);
        IOperation withdraw = factory.createWithdraw(davsdd);

        deposit.act(new BigDecimal("100.0"));
        getCurrentBalance(davsdd);
        deposit.act(new BigDecimal("50.0"));
        getCurrentBalance(davsdd);
        withdraw.act(new BigDecimal("15.0"));
        getCurrentBalance(davsdd);

        Account john = new Account(new BigDecimal("0.0"), "john");
        getCurrentBalance(john);
        IOperation depositJohn = factory.createDeposit(john);
        IOperation withdrawJohn = factory.createWithdraw(john);
        depositJohn.act(new BigDecimal("670.0"));
        getCurrentBalance(john);
        withdrawJohn.act(new BigDecimal("340.0"));
        getCurrentBalance(john);
        withdrawJohn.act(new BigDecimal("100000.0"));
        getCurrentBalance(john);

    }

    public static void getCurrentBalance(Account account){
        System.out.printf("Current %s balance: $%s\n", account.getAccountName(), account.getBalance());
    }

}
