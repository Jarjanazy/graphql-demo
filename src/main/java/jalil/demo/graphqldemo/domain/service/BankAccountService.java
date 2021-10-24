package jalil.demo.graphqldemo.domain.service;

import jalil.demo.graphqldemo.domain.entity.BankAccount;
import jalil.demo.graphqldemo.domain.repo.BankAccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankAccountService
{
    private final BankAccountRepo bankAccountRepo;

    public List<BankAccount> findAll()
    {
        return bankAccountRepo.findAll();
    }

    public void addBankAccounts(List<BankAccount> bankAccounts)
    {
        bankAccountRepo.saveAll(bankAccounts);
    }

}
