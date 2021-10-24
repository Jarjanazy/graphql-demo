package jalil.demo.graphqldemo.api.graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@RequiredArgsConstructor
public class BankAccountResolver implements GraphQLQueryResolver
{
    private final BankAccountService bankAccountService;

    public List<BankAccount> bankAccounts(){
        return bankAccountService.findAll();
    }
}
