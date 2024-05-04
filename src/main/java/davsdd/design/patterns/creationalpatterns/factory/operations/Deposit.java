package davsdd.design.patterns.creationalpatterns.factory;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Deposit implements IOperation {

    private Account account;
    @Override
    public void act(BigDecimal amount) {
        if (amount !=null && account !=null){
            BigDecimal balance = account.getBalance();
            if (balance !=null && balance.compareTo(BigDecimal.ZERO) >= 0){
                account.setBalance(balance.add(amount));
            }
        }
    }
}
