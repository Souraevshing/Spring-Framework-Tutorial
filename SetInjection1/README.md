# Inserting set inside array

## Summary
- We can insert `Set` inside array.
- Spring provides `<set>` tag to inject a Java Set using XML.
- The `<set>` tag is used within `<property>` or `<constructor-arg>`.
- To add values in the Set, the Spring framework provides `<value>` tag which is nested within `<set>` tag.
- The `<set>` tag creates and passes the `java.util.LinkedHashSet` object.

## Syntax

`

    <property name="…">
        <set>
            <value>...</value>
            <value>...</value>
            <value>...</value>
        </set>
    </property>


`