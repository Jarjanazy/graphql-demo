package jalil.demo.graphqldemo.api.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomScalarConfig
{
    @Bean
    public GraphQLScalarType positiveInt()
    {
        return ExtendedScalars.PositiveInt;
    }
}
