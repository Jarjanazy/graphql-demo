package jalil.demo.graphqldemo.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import jalil.demo.graphqldemo.api.dto.CreateBankAccountInput;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Client;
import jalil.demo.graphqldemo.domain.entity.Currency;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankAccountMutation implements GraphQLMutationResolver
{

    BankAccount createBankAccount(CreateBankAccountInput input)
    {
        Client client = Client.builder().firstName(input.getFirstName()).lastName(input.getLastName()).build();

        return BankAccount.builder().id(UUID.randomUUID()).client(client).currency(Currency.DL).build();
    }
}
