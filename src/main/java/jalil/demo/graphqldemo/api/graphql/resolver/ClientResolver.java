package jalil.demo.graphqldemo.api.graphql.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientResolver implements GraphQLResolver<BankAccount>
{
    // this means: client is a subtype of BankAccount
    public Client client(BankAccount bankAccount)
    {
        return Client
                .builder()
                .firstName(bankAccount.getClient().getFirstName())
                .lastName(bankAccount.getClient().getLastName())
                .build();
    }
}
