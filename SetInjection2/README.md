# Inserting set inside array

## Summary
- We can inject `Set` inside `array` tag.
- Using `SetFactoryBean` class for the bean.
- The child of the bean tag has a property tag having name attribute set to `targetSetClass` & another property tag that is also a child having name attribute set to `sourceSet`.
- The `targetSetClass` has nested value tag and the value is the Collection's class/interface that we want to use.
- The `sourceSet` has nested value tag, and it can have Collection classes/interfaces `Set`.
- It is the first type of approach using FactoryBean class.

## Syntax

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