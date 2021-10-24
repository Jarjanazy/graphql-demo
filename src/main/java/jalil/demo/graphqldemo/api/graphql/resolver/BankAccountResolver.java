package jalil.demo.graphqldemo.api.graphql.resolver;

import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLQueryResolver;
import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Currency;
import org.springframework.stereotype.Component;
import java.util.UUID;


@Component
public class BankAccountResolver implements GraphQLQueryResolver
{
    public DataFetcherResult<BankAccount> bankAccount(UUID id){
        // here we don't have to specify that we want the client
        // its resolver will be picked up by spring
        return DataFetcherResult.<BankAccount>newResult()
                .data(BankAccount
                        .builder()
                        .id(id)
                        .currency(Currency.DL)
                        .build())
                .error(new GenericGraphQLError("an Error has happened"))
                .build();
    }
}
