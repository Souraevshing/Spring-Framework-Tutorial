# Injecting set inside array

## Summary
- The `set-class` takes any class/interface of Collection library, and it takes only Set implementation.
- It explicitly sets the value of the beans nested child property that takes value property.
- It is the 2nd approach using updated schema and the xml is easy to understand and not lengthy.

## Syntax 1 (util schema)

`

    <bean class="com.set.injection.beans.Student" id="student">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
        <property name="emails">
            <util:set id="emails" set-class="java.util.TreeSet">
                <value>...</value>
                <value>...</value>
                <value>...</value>
            </util:set>
        </property>
    </bean>

`

## Syntax 2 ( SetFactory bean)

`

    <bean class="org.springframework.beans.factory.config.SetFactoryBean">
        <property name="targetSetClass">
            <value>java.util.TreeSet</value>
        </property>
        <property name="sourceSet"> 
            <set>
	            <value>...</value>
	            <value>...</value>
	            <value>...</value>
            </set>
        </property>
    </bean>

`