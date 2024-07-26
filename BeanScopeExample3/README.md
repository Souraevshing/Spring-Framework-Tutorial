# Prototype bean in spring

## Summary
- When we define a bean with the `prototype` scope then:
  - The container creates a `new instance` of that bean every time a `request` is made to that bean.
  - It means that whenever we call the `getBean(...)` method, or we will `inject` that bean into `another bean`, the `container` will create a `new object` and return it.
- Two more points about prototype bean
  - `Prototype` beans `do not` share their `state` with `other bean instances`. Each `instance` has its own `independent state`, and any `modification` to one bean instance `will not affect` other instances.
  - Spring does `not manage` the complete `lifecycle` of a prototype bean. The container `instantiates` and configures a prototype bean object and hands it to the client, with `no further record` of that `prototype` instance.
- If we change any property of a prototype bean after its creation, then this change `will be reflected` in only the `references` used to `change the data`.
- That’s because `every reference` points to a `separate` prototype bean object.

---

## Syntax
`

    <bean class="com.beanscope.demo.beans.Student" id="student" scope="prototype">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
    </bean>
`

### Note:
- On setting the scope of bean to `singleton`, all the beans will share the `same reference` & the address (memory location) `hashcode` will be the `same` for all beans.
- On setting the scope of bean to `prototype`, all the beans will share the `different reference` & the address (memory location) `hashcode` will be `different` for all beans.
