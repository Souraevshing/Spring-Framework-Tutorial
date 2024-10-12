# AnnotationAutoWiring in spring

## Summary
- AnnotationAutoWiring is a `mechanism` in Spring that allows the framework to `automatically detect` and inject the dependent beans to the properties of the target bean without the need for `explicit` configuration.
- In simple words, when we apply autowiring, then Spring looks for the `dependent` beans in the container and `automatically injects` them into the target object.
- Benefits:
    - This can `save` a lot of `time and effort`, especially in large-scale applications where there are a large number of `dependencies` between objects.
- Drawbacks:
    - No `control` of the programmer.
    - It can’t be used for `primitive` and not recommended for `string` values.

## Syntax
`

    <bean class="com.autowire.demo.beans.Account" id="account1">
        <property name="accountId" value="SV-101"/>
        <property name="balance" value="50000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Account" id="account2">
        <property name="accountId" value="SV-102"/>
        <property name="balance" value="100000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Customer" id="customer" autowire="byName">
        <property name="customerName" value="Neeraj"/>
        <property name="account" ref="account2"/>
    </bean>
`

## Conclusion
- `AppConfig.java`: Java-based configuration class with `@Bean` definitions for autowiring.
- `application-conf.xml`: XML-based configuration for autowiring `Customer` and `Account` beans.
- `Customer.java`: A class representing a customer with an account dependency.
- `Person.java`: A class to demonstrate autowiring using Java configuration.
- `UseCustomer.java` and `UsePerson.java`: Main application classes that load the Spring context and display the injected beans.
- Here, we’re annotating the `AppConfig` class with `@Configuration` `@ComponentScan` to allow Spring IoC to scan all the beans defined under `AppConfig`.

## Note:
- The jar `spring-aop` is required for annotation processing and let spring automatically scan the bean from `Configuration` class.