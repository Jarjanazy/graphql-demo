package jalil.demo.graphqldemo.domain.seeder;

import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.entity.Client;
import jalil.demo.graphqldemo.domain.enums.Currency;
import jalil.demo.graphqldemo.domain.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class BankAccountSeeder implements CommandLineRunner
{
    private final BankAccountService bankAccountService;

    @Override
    public void run(String... args)
    {
        Client client1 = Client.builder().firstName("abdo").lastName("jarjor").build();
        Client client2 = Client.builder().firstName("adnan").lastName("rihawi").build();

        BankAccount bankAccount1 = BankAccount.builder().currency(Currency.DL).client(client1).build();
        BankAccount bankAccount2 = BankAccount.builder().currency(Currency.TL).client(client2).build();

        bankAccountService.addBankAccounts(Arrays.asList(bankAccount1, bankAccount2));
    }
}
