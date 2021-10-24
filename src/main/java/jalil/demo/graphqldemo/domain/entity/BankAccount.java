package jalil.demo.graphqldemo.domain.entity;

import jalil.demo.graphqldemo.domain.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    Client client;

    Currency currency;
}
