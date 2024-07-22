# Constructor injection in spring

## Summary
- Like `<properties>` tag , the `<constructor-arg>` tag also allows us to insert `object references` as `dependencies`.
- To do this, we use ref attribute of `<constructor-arg>` tag instead of the `value` attribute.
- The `ref` attribute then refers to another bean definition's `id/name`.
- As discussed previously we also can pass `dependency` to the  `<constructor-arg>` tag using `inner bean`.
- The syntax almost remains same just like it was with `<property>` tag

## Syntax
`
    
    <bean class="com.constructor.injection.beans.Address" id="address">
        <property name="houseNo" value="12"/>
        <property name="city" value="Bhopal"/>
        <property name="locality" value="Arera"/>
    </bean>

    <bean class="com.constructor.injection.beans.Student" id="student">
        <constructor-arg type="int" value="25" name="roll"/>
        <constructor-arg type="String" value="Amit"/>
        <constructor-arg type="com.constructor.injection.beans.Address" ref="address"/>
    </bean>
`