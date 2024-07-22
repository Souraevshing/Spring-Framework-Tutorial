# Constructor injection in spring

## Summary
- Constructor injection is another way of `dependency injection`.
- In constructor injection, when the Spring container creates an instance of the class, it passes the required dependencies as `arguments` to the `constructor`.
- For performing constructor injection we use the tag `<constructor-arg>`.
- It is a sub tag of `<bean>` tag in spring configuration file.

## Syntax
`
<constructor-arg  value="..."  index="..." type="..."  ref="..." />
`

- Note:
    - `value`: Used to assign value of primitive type or string.
    - `ref`: Used to assign Object type value.
    - `index`: Indicates the argument position. Position starts from 0.
    - `type`: Indicates the data type of argument.
    - One `<constructor-arg>` tag describes one argument of the constructor.
    - This means that if the constructor is defined with multiple arguments we need to use `<constructor-arg>` element `multiple times` to enable Spring to `call that constructor`.
