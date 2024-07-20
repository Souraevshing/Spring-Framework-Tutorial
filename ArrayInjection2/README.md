# Inserting multiple beans inside array

## Summary
- We can insert multiple beans instead of primitive values using `property` tag.
- It is done by passing id attribute and class attribute.
- The `class` attribute takes fully qualified class name.
- The `id` ia a unique attribute assigned to bean

## Syntax

`
                
            <array>
                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>

                <bean class="...">
                    <property name="..." value="..."/>
                    <property name="..." value="..."/>
                </bean>
            </array>
`