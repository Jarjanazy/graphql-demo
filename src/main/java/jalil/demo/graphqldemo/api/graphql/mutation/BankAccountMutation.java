package jalil.demo.graphqldemo.api.graphql.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import jalil.demo.graphqldemo.api.graphql.dto.CreateBankAccountInput;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Client;
import jalil.demo.graphqldemo.domain.enums.Currency;
import jalil.demo.graphqldemo.domain.repo.BankAccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class BankAccountMutation implements GraphQLMutationResolver
{
    private final BankAccountRepo bankAccountRepo;

    BankAccount createBankAccount(CreateBankAccountInput input, DataFetchingEnvironment environment)
    {
        Client client = Client.builder().firstName(input.getFirstName()).lastName(input.getLastName()).build();

        BankAccount bankAccount = BankAccount.builder().client(client).currency(Currency.DL).build();

        return bankAccountRepo.save(bankAccount);
    }
}
