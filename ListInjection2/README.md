# Inserting LinkedList inside array

## Summary
- We can also insert `LinkedList` into array.
- It can be done using following ways
  - By updating xml and adding new schema called `util`.
  - By using the class `ListFactoryBean` inside xml.
- The class `ListFactoryBean` provides developer a way to use concrete `List` implementation `class(Array or LinkedList)` inside spring xml configuration.
- In order to use this class inside xml, we have to add extra `<bean>` and `<property>` tag as child tag of outer `<property>` tag.

## Syntax

`

        <property name=“…">
			<bean class="org.springframework.beans.factory.config.ListFactoryBean">
				<property name="targetListClass">
					<value>java.util.LinkedList</value>
				</property>
				<property name="sourceList"> 
					<list>
		                <value>…</value>
		                <value>…</value>
		                <value>…</value>
					</list>
				</property>
			</bean>
        </property>


`