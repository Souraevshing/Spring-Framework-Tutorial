# Inner Beans inside Spring Framework

## Use cases of inner beans:
- Inner beans is used to define and declare a bean within a scope of another bean.
- As a standard practice, when a bean is used for a particular purpose for one bean, then it is advised to use inner bean.
- It makes our code secure from outer world.

## Important points:
- When a bean do not need to be shared by other beans, then it can be declared as inner bean.
- An inner bean cannot be used by other beans except enclosing bean.
- Inner beans does not require id attribute to access, but we can provide it for readability. Since spring will recognize the inner bean just by seeing the outer bean.

## Syntax

`
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean class="com.spring.demo.beans.Customer" id="customer1">
        <property name="name" value="Sourav"/>
            <property name="account">
                <bean class="com.spring.demo.beans.Account" id="account1">
                    <property name="accountId" value="SAVINGS-ACC-101" />
                    <property name="balance" value="400000" />
                </bean>
            </property>
    </bean>

    <bean class="com.spring.demo.beans.Customer" id="customer2">
        <property name="name" value="Codey"/>
        <property name="account">
            <bean class="com.spring.demo.beans.Account" id="account2">
                <property name="accountId" value="SAVINGS-ACC-102" />
                <property name="balance" value="500000" />
            </bean>
        </property>
    </bean>

</beans>
`

* Note:
- Here, we are declaring 2 outer beans for each outer bean.
- Outer bean is Customer class and Account is the inner bean.
- And for each inner Account bean, both can be accessed inside that outer bean and no other bean can access the Account bean.
- This ensures security for inner beans, and thereby implementing encapsulation of OOP's principle.