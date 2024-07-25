# Constructor Injection in spring

## Summary
- That’s because by default `every value is convertible to String` and thus the Spring container assumed even `“101”` also to be a string and executed the `Student(String,String)` constructor.
- As usual, to overcome this we should provide type attribute.

## Syntax
`

    <bean class="com.constructor.injection.beans.Student" id="useStudent">
        <constructor-arg value="101" />
        <constructor-arg value="Amit" />
    </bean>

`

## Output (Without using type attribute)
`

    Student bean initialized using str-str constructor
    Student name: 101 Amit
    Student roll: 0

`

## Output (using type attribute)
`

    Student bean initialized using str-str constructor
    Student name: Amit
    Student roll: 101

`

## Conclusion
- Now, we can conclude that by using `type` attribute we make our code return correct output.
- It is recommended to use `type` attribute when using `constructor injection`.
- Using `type` attribute is not compulsory, we will not get any compilation error, but it makes our code error free and consistent.