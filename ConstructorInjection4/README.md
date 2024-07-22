# Constructor injection in spring

## Summary
- Let's observe the output first:
  `

       instance of student created using int-str-constructor
       Student name: Amit
       Student roll: 101
`
- Look at the `<constructor-arg/>`, we haven't provided `type` attribute, although we are getting correct output.
- It's because we have only 1 constructor, and we are passing arguments in the same order as defined in the constructor, so  Spring container  will recognize the appropriate constructor.

## Syntax
`

    <bean class="com.constructor.injection.beans.Student" id="student">
        <constructor-arg  value="101" />
        <constructor-arg  value="Amit" />
    </bean>

`