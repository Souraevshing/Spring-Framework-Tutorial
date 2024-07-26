# Prototype bean scope in spring

## Summary
- On setting bean scope to `prototype` only the values that are `updated` only that will change `rest other` values will remain as it is.

---

## Syntax
`

    <bean class="com.beanscope.demo.beans.Student" id="student" scope="prototype">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
    </bean>
`