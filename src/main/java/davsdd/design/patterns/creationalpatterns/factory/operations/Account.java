package davsdd.design.patterns.creationalpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Account {

    private BigDecimal balance;
    private String accountName;

}
