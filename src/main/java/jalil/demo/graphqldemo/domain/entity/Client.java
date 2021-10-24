package jalil.demo.graphqldemo.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    String firstName;

    String lastName;
}
