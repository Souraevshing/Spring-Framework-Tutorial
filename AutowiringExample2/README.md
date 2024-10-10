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

    <bean class="com.autowire.demo.beans.com.autowire.demo.Account" id="account">
        <property name="accountId" value="SV-101"/>
        <property name="bal" value="50000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.com.autowire.demo.Customer" id="customer" autowire="byName">
        <property name="name" value="Neeraj"/>
    </bean>
`

## Conclusion
- You will get the correct output since we’re autowiring `byName` and spring will try to get the name of dependent bean by the `id`.