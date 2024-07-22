# Constructor injection in spring

## Summary
- On seeing the xml configuration, we have outer bean declaring `Student` bean and inner bean `Address`.
- Setting values using `constructor-injection` to initialize `Student` details.
- Another `constructor-injection` is setting `Address` bean using `setter injection`.

## Syntax
`

    <bean class="com.constructor.injection.beans.Student" id="student">
        <constructor-arg type="int" value="201"/>
        <constructor-arg type="String" value="Ritesh"/>
        <constructor-arg type="com.constructor.injection.beans.Address">
            <bean class="com.constructor.injection.beans.Address">
                <property name="houseNo" value="12"/>
                <property name="city" value="Delhi"/>
                <property name="locality" value="Paschim Vihar"/>
            </bean>
        </constructor-arg>
    </bean>
`