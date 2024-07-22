# Constructor injection in spring

## Summary
- Spring provides another `attribute` called `index` in `<constructor-arg>` tag for `resolving ambiguities` which even type cannot resolve.
- Let's observe the output.
- This is an expected behavior because we know that `Spring` prefers
  String `parametrized constructor` over `other constructors`.
- We also know that to resolve this issue we use the type attribute in the `<constructor-arg>` tag.

## Syntax 1
`

    <bean class="com.constructor.injection.beans.Employee" id="employee">
        <constructor-arg value="10000" />
        <constructor-arg value="Sumit" />
    </bean>
`

## Output 1 (based on above configuration)
`

    instance of employee created using string-string constructor
    Employee name: 10000
    Employee salary: 0.000000
    Employee designation: Sumit
`

## Syntax 2 (updating configuration by adding type attribute)
`

    <bean class="com.constructor.injection.beans.Employee" id="employee">
        <constructor-arg type="float" value="10000" />
        <constructor-arg value="Sumit" />
    </bean>
`

## Output 2 (based on adding type attribute)
`

    instance of employee created using float-string constructor
    Employee name: Sumit
    Employee salary: 10000.0
    Employee designation: null
`

## Note:
- Adding `type` attribute changes the output since Spring is calling `public Employee(float salary, String name)` constructor.

## Syntax 3 (updating configuration by adding type attribute)
`

    <bean class="com.constructor.injection.beans.Employee" id="employee">
        <constructor-arg type="float" value="10000" />
        <constructor-arg value="Sumit" />
    </bean>
`