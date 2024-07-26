# Bean scopes in spring

## Summary
- Bean `Scope` is an important part of bean `creation`, and it helps the Spring container to decide:
    - When will the object of Bean be instantiated?
    - How long that object will live?
    - How many objects will be created for that bean throughout?
- Bean Scope Spring allows us to set `8 scopes` for our `bean object` and they are:
  1. singleton
  2. prototype
  3. request
  4. session
  5. global-session
  6. application
  7. websocket
  8. custom
- Amongst them, the `global-session` scope is only `valid` for `Portlets` and not for other types of Spring applications
- `Portlets` is a `self contained` component displayed on `web page`.
    - Just like `servlets`, it also `sends/receives` `request/response` but primarily used for `displaying` charts, calendar, weather, etc.

---

### Singleton bean scope
- When we define a bean with the `singleton` scope, then:
    - The container creates a single instance of that bean.
    - It means that all `requests` for that bean using `getBean(...)` will return the `same object`, which is `cached`.
- Two more points about singleton bean:
    - This `scope` is the `default` value if no other scope is `specified`. 
    - Any `modifications` to the object will be `reflected` in all `references` to the bean.

---

## Syntax
`

    <bean class="com.beanscope.demo.beans.Student" id="stObj" scope="singleton">
        <property name="rollno" value="101"/>
        <property name="name" value="Amit"/>
    </bean>
`