package jalil.demo.graphqldemo.domain.repo;

import jalil.demo.graphqldemo.domain.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>
{

}
