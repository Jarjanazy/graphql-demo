package jalil.demo.graphqldemo.api.graphql.dto;

import lombok.Data;

@Data
public class CreateBankAccountInput
{
    String firstName;

    String lastName;

    int age;
}
