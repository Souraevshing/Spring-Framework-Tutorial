# Inserting list inside array

## Summary
- Using class `ListFactoryBean` enable developer to use collection but requires some extra tags making code difficult.
- An easy way to use `util schema` and tags inside spring xml configuration.
- As the name suggests, the `util` schema deals with common utility configuration issue such as configuring collections.
- The only change is that we have to change our xml schema a bit.
- `list-class` attribute of `<util:list>` tag is used to explicitly control the exact type of List that will be instantiated & populated via using this attribute.

## Syntax 1 (util schema)

`

    <property name=“…">
        <util:list id=“…”>
            <value>…</value>
            <value>…</value>
            <value>…</value>
        </util:list >
    </property>

`

## Syntax 2 (util ListFactory bean)

`

    <bean class="org.springframework.beans.factory.config.ListFactoryBean">
        <property name="targetListClass">
            <value>java.util.LinkedList</value>
        </property>
        <property name="sourceList"> 
            <list>
		        <value>...</value>
		        <value>...</value>
		        <value>...</value>
            </list>
        </property>
    </bean>


`

- Note - `list-class` attribute of `<util:list>` tag is used to explicitly control the exact type of List that will be instantiated & populated via using this attribute.