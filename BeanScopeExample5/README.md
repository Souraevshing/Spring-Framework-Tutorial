# Prototype bean scope in spring

## Summary
- Will Spring create a prototype bean object only and only when we request it?
  - The General answer to this is `YES`, except one `special` case.
  - Suppose a `prototype` bean is set as `dependency` inside a `singleton` bean.
  - Now `as soon as` the Spring `container starts`, it will `instantiate` that `singleton` bean, and in `that process` it will also `instantiate` prototype bean even though we have `not requested` it.
- Now, in the below XML configuration, `Student` depends on `Address` bean, it will instantiate `singleton` bean but this is a `special case` where spring will also instantiate `prototype` bean even though we have `not` requested it.

---

## Syntax
`

    <bean id="address" class="com.beanscope.demo.beans.Address" scope="prototype">
        <property name="houseNo" value="15"/>
        <property name="city" value="Bhopal"/>
    </bean>

    <bean class="com.beanscope.demo.beans.Student" id="student">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
        <property name="address" ref="address"/>
    </bean>
`