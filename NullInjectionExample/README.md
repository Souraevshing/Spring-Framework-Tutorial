# Null injection inside spring

## Summary
- We can also inject `null` values inside beans.
- Spring provides `<null/>` tag to inject null value inside `Student` bean in `dob` field.
- Spring also provides developers to `inject` java classes as beans inside XML.

## Syntax
`

    <bean class="com.nullinjection.demo.beans.Student" id="stObj2">
    <constructor-arg value="102"/>
    <constructor-arg value="Mahesh"/>
    <constructor-arg>
        <null/>
    </constructor-arg>
    </bean>
`