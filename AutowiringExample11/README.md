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

    <bean class="com.autowire.demo.beans.Account" id="account">
        <property name="accountId" value="SV-101"/>
        <property name="balance" value="50000.0"/>
    </bean>

    <bean class="com.autowire.demo.beans.Address" id="address">
        <property name="houseNo" value="25"/>
        <property name="city" value="Bhopal"/>
    </bean>

    <bean class="com.autowire.demo.beans.Customer" id="customer" autowire="constructor">

    </bean>
`

## Conclusion
- Here, since for the last bean, no values are injected for Customer.
- Therefore, for constructor with 4 arguments, since no argument is passed so the default values for name will be `null` and age will be `0`
- Spring will choose automatically which constructor to use out of two.
- But we can add following code to resolve ambiguity to call constructor having first argument as `Account` and second as `Address`.
 

`
    
    <bean class="com.autowire.demo.beans.Customer" id="customer">
      <constructor-arg ref="account"/>
      <constructor-arg ref="address"/>
    </bean>
`