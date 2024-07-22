# Constructor injection in spring

## Summary
- Analyze the output of this code.
- The sum is 30 since the `type` is `int` and `index` is 1 and 0 respectively.
- Since `index` is 1 for 1st constructor, the value of `a` is `20`.
- Since `index` is 0 for 2nd constructor, the value of `b` is `10`.

## Syntax
`

    <bean class="com.constructor.injection.beans.AddNumber" id="addNumber">
        <constructor-arg type="int" index="1" value="10" />
        <constructor-arg type="int" index="0" value="20" />
    </bean>
`

## Conclusion
- Spring calls `public AddNumber(int a, int b)` constructor and hence the output.