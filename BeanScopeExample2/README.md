# Singleton bean in spring

## Summary
- As mentioned before, if we change any `property` of a `singleton bean` after its `creation`, then this change will be `reflected` in all `references` to the bean.
- That's because although `references are different`, but they are `pointing` to the `same` singleton bean `object`.
- If we create `multiple` no of beans, then `all references` will be `pointing` to the same `object`.
- `Spring` will manage all the `lifecycle` of bean i.e., from `creation` to `destruction`.

---

## Syntax
`

    <bean class="com.beanscope.demo.beans.Student" id="student" scope="singleton">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
    </bean>
`