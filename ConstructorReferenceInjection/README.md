# Constructor reference injection]

## Summary
- We can insert bean class using `constructor-injection` in spring.
- The bean will be an `inner bean` and properties set via `setter injection`.

## Syntax
`

    <bean class="com.constructorref.demo.beans.Student" id="student">
        <constructor-arg type="int" value="201"/>

        <constructor-arg type="String" value="Ritesh"/>

        <constructor-arg type="com.constructorref.demo.beans.Address">
            <bean class="com.constructorref.demo.beans.Address" >
                <property name="houseNo" value="12"/>
                <property name="city" value="Delhi"/>
                <property name="locality" value="Paschim Vihar"/>
            </bean>
        </constructor-arg>
    </bean>
`