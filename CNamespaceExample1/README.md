# CNamespace inside spring

## Summary
- Similar to, p-namespace we have `c:namespace` which is the replacement of `constructor-arg` tag.
- It is a shortcut to configure constructor arguments directly in `<bean>` tag. 
- To use Spring `c-namespace`, we first have to add the following `xmlns:c` at the top in our XML schema:
  - `xmlns:c="http://www.springframework.org/schema/c"`
- Once we do this, we can now remove the `<constructor-arg>` tag and pass the values in the `<bean>` tag itself using the following syntax:

  - `<bean class="…" id="…" c:prop_Name="…" c:prop_Name="..">`
- The term `prop_Name` will be replaced with actual name of property as shown:
  - `c:roll="100"`

## Syntax
`
    <bean
    class="com.namespace.demo.beans.Student"
    id="useStudent"
    c:rollno="102"
    c:name="Nitesh"
    c:gender="male"
    />
`