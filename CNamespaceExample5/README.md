# CNamespace inside spring

## Syntax
`
    
    <bean class="com.namespace.demo.beans.Address" id="address" c:houseNo="12" c:city="Bhopal" c:locality="new mkt"/>

    <bean class="com.namespace.demo.beans.Subject" id="subj" c:phy="50" c:chem="60" c:math="70"/>

    <bean
            class="com.namespace.demo.beans.Student"
            id="useStudent"
            c:rollno="102"
            c:name="Nitesh"
            c:gender="male"
            c:address-ref="address"
            c:subj-ref="subj"
    />
`

## Limitations of PNamespace and CNamespace
- `No support` for inner beans.
- Cannot inject arrays or collections.
- `c:namespace` has `no support` for `type` attribute and `cannot resolve ambiguities` based on it.
- They also have `no support` for `null injection`.

