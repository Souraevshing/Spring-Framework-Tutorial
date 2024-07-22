# Constructor injection in spring

## Summary
- We have changed the order of constructor.
- Observe the output.

## Syntax 1
`

    <bean class="com.constructor.injection.beans.Employee" id="employee">
        <constructor-arg  type="float" value="10000" />
        <constructor-arg  type="String"  value="Sumit" />
    </bean>
`

## Output
`

    bean initialized using str-float constructor
    Name:null
    Designation:Sumit
    salary:10000.0

`

## Syntax
`

    <bean class="com.constructor.injection.beans.Employee" id="employee">
        <constructor-arg  type="float" index="0" value="10000" />
        <constructor-arg  type="String"  value="Sumit" />
    </bean>
`

## Output
`

    bean initialized using float-str constructor
    Name:Sumit
    Designation:null
    salary:10000.0
`

## Conclusion
- For 1st use case output, observe the output, why we are we getting wrong output ?
    - That's because internally Spring uses `ConstructorResolver` class to decide `which constructor` to use to `initialize` our beans.
    - This class uses `Reflection` technique which `selects` the `first matching constructor` from the `constructor list` available and this `list is random`.
    - That's why if we change the `order of constructor` in the class , the `selected constructor` changes.
- To resolve this, add `index` attribute
    - To resolve this problem the Spring team strongly `recommends` to use another attribute called `index` with type attribute in `<constructor-arg>`.
    - This attribute `instructs the container` to select the constructor based upon the index `/order` `/position` of supplied arguments.