# Constructor injection in spring & ambiguity

## Summary
- Notice the output of the code: 
`

      instance of useStudent created using str-constructor
      Student name: 101
      Student roll: 0
`
- We can see the value of name is 101 and roll is 0.
- Why `roll is 0` ?
  - The roll is 0 since the construction injection is done for roll no, and we all know the Java sets the default value of local data member. Here, i.e. `roll` is of type `int`, therefore the value `0` is assigned.
- Why `name is 101` ?
    - That’s because the `Spring container` `prefers` `String parameter` over `others` because by  default every value is `convertible to String`. 
    - So `Spring` assumes that we want to call the `String argument constructor` with the value `"101"`.
- The solution is to use `type` attribute inside `<constructor-arg/>` whose value will be data type.
## Syntax
`

        <bean class="com.constructor.injection.beans.Student" id="useStudent">
            <constructor-arg value="101" />
        </bean>

`

## Note
- Always remember, this punchline `SPRING LOVES SPRING`, it will always give preference to `String` data type.
- The `Spring` data type is `considered primitive` inside `Spring`.