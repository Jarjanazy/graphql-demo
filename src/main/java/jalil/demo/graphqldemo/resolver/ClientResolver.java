package jalil.demo.graphqldemo.resolver;

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
                .firstName("abdo")
                .lastName("jrjor")
                .build();
    }
}
