# Injecting map inside array

## Summary
- Spring provides `<map>` tag to inject a Java Map using XML.
- The `<map>` tag is used within `<property>` or `<constructor-arg>`.
- To add values in the `Map`, the Spring framework provides `<entry>` tag which is nested within `<map>` tag.
- The <map> tag creates a passes the java.util.LinkedHashMap object.

## Syntax 1 (Using util schema)

`

    <property name="...">
        <map>
	        <entry key="..." value="..."/>
	        <entry key="..." value="..."/>
	        <entry key="..." value="..."/>
        </map>
    </property>

`

## Syntax 2 (Using MapFactory bean)

`

    <bean class="org.springframework.beans.factory.config.MapFactoryBean">
			<property name="targetMapClass">
				<value>java.util.TreeMap</value>
			</property>
			<property name="sourceMap"> 
				<map>
					<entry key="..." value="..."/>
					<entry key="..." value="..."/>
					<entry key="..." value="..."/>
				</map>
			</property>
    </bean>

`