# PNamespace inside spring

## Summary
- We can also inject a bean object inside `constructor` namespace.

## Syntax
`

    <bean class="com.namespace.demo.beans.Address" id="address" p:houseNo="12" p:city="Bhopal" p:locality="new mkt"/>
    <bean
            class="com.namespace.demo.beans.Student"
            id="useStudent"
            p:rollno="102"
            p:name="Nitesh"
            p:gender="male"
            p:address-ref="address"
    />

`

## Note
- Here `p:address-ref="address"` is used to `inject` Address bean class inside Student bean.