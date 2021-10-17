package jalil.demo.graphqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Currency;
import org.springframework.stereotype.Component;
import java.util.UUID;


@Component
public class BankAccountResolver implements GraphQLQueryResolver
{
    public BankAccount bankAccount(UUID id){
        return BankAccount
                .builder()
                .id(id)
                .currency(Currency.DL)
                .name("abdo").build();
    }
}
