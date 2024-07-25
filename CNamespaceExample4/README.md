# CNamespace inside spring

## Syntax
`

    <bean class="com.namespace.demo.beans.Address" id="address" c:houseNo="12" c:city="Bhopal" c:locality="new mkt"/>

    <bean
            class="com.namespace.demo.beans.Student"
            id="useStudent"
            c:rollno="102"
            c:name="Nitesh"
            c:gender="male"
            c:address-ref="address"
    />
`