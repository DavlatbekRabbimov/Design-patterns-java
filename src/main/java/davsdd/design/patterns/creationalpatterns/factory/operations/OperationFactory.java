package davsdd.design.patterns.creationalpatterns.factory;

public class OperationFactory {

    public IOperation createDeposit(Account account){
        return new Deposit(account);
    }

    public IOperation createWithdraw(Account account){
        return new Withdraw(account);
    }

}
