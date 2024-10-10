# Autowiring in spring

## Summary
- Autowiring is a `mechanism` in Spring that allows the framework to `automatically detect` and inject the dependent beans to the properties of the target bean without the need for `explicit` configuration.
- In simple words, when we apply autowiring, then Spring looks for the `dependent` beans in the container and `automatically injects` them into the target object.
- Benefits:
    - This can `save` a lot of `time and effort`, especially in large-scale applications where there are a large number of `dependencies` between objects.
- Drawbacks:
    - No `control` of the programmer.
    - It can’t be used for `primitive` and not recommended for `string` values.

## Syntax
`

    <bean class="com.autowire.demo.beans.Account" id="account1" primary="true">
        <property name="accountId" value="SV-101"/>
        <property name="balance" value="50000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Account" id="account2" >
        <property name="accountId" value="SV-102"/>
        <property name="balance" value="100000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Customer" id="customer" autowire="constructor">
        <property name="name" value="Neeraj"/>
    </bean>
`

## Conclusion
- Setting `autowire` to `constructor` will inject dependencies using constructor injection.
- Here the bean that has attribute `primary` set to `true` will take the preference and will be injected using constructor injection.