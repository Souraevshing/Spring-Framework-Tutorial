# Injecting bean inside array

## Summary
- We can also inject beans inside `array` tag
- It is done using `ref` tag.
- The `ref` tag takes bean attribute whose value is id or name of bean.

## Syntax

`

            <array>
                <ref bean="..." />
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