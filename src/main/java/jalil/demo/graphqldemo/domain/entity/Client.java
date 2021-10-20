package jalil.demo.graphqldemo.domain.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Client
{
    String firstName;

    String lastName;
}
