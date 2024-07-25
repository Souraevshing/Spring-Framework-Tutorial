# CNamespace injection inside spring

## Summary
- The `c:namespace` allows us to specify constructor arguments based on `index` also.
- To do this, we use the following XML code:
    - `<bean class="…" id="…" c:_0="…" c:_1="..">`

## Syntax
`

    <bean
    class="com.namespace.demo.beans.Student"
    id="useStudent"
    c:_0="102"
    c:_1="Nitesh"
    c:_2="male"
    />
`