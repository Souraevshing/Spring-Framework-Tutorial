# Injecting collections to array

## Summary
- Spring allows us to inject collections using 3 tags `<list/>`, `<set/>`,`<map/>` tags.
- Spring provides `<list/>` to inject List inside array.
- The `list` tag is used inside `<property/>` and `<constructor-arg/>` tags.
- The `list` tag has `value` which is nested in list `tag`.

## Syntax 1 (inserting primitive values)

`

            <property name="...">
                <list>
                    <value>...</value>
                    <value>...</value>
                    <value>...</value>
                </list>
            </property>
`

## Syntax 2 (inserting beans)

`

            <property name="...">
                <list>
                    <bean class="..." id="...">
                        <property name="..." value="..." />
                        <property name="..." value="..." />
                        <property name="..." value="..." />
                    </bean>
                </list>
            </property>
`

## Syntax 3 (inserting )

`

            <property name="...">
                <list>
                    <ref bean="..."/>
                </list>
            </property>
`