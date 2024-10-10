# Autowiring in spring

## Summary
- Autowiring is a `mechanism` in Spring that allows the framework to `automatically detect` and inject the dependent beans to the properties of the target bean without the need for `explicit` configuration.
- In simple words, when we apply autowiring, then Spring looks for the `dependent` beans in the container and `automatically injects` them into the target object.
- Benefits:
    - This can `save` a lot of `time and effort`, especially in large-scale applications where there are a large number of `dependencies` between objects.
- Drawbacks:
    - No `control` of the programmer.
    - It can't be used for `primitive` and not recommended for `string` values.

## Syntax
`

    <bean class="com.autowire.demo.beans.Account" id="account1" autowire-candidate="true">
        <property name="accountId" value="SV-101"/>
        <property name="balance" value="50000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Account" id="account2"  primary="true" autowire-candidate="false">
        <property name="accountId" value="SV-102"/>
        <property name="balance" value="100000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Account" id="account3" autowire-candidate="false">
        <property name="accountId" value="SV-103"/>
        <property name="balance" value="200000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Customer" id="customer" autowire="byType">
        <property name="name" value="Neeraj"/>
    </bean>
`

## Conclusion
- By setting autowiring type to `byName` it will detect the dependant bean by name.
- If we have more than two beans of the same type then setting type to `byName` will throw exception `NoUniqueBeanDefinitionException` since spring will find multiple beans of the same type.
- To handle this and help Spring select a particular bean to be injected, we can set an attribute called `autowire-candidate` to false for all other beans.
- This means that for all the beans where an `autowire-candidate` is set to false, the Spring container will not consider them for `autowiring`.
- Possible values for `autowire-candidate`:
    - `true`: bean is candidate for autowiring.
    - `false`: bean is not a candidate for autowiring.
    - `default`: spring decides automatically which bean to inject.
- Note: If we don’t specify the autowire-candidate attribute, it defaults to true, meaning the bean will be considered for autowiring.
- If we want to select one from list of beans, we can set `autowire-candidate` to `false` for every except one that we want to inject or set attribute `primary` to `true`.