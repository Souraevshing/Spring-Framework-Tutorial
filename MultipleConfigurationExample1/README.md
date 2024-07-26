# Using multiple XML configurations to inject values

## Summary
- Spring also provides developers to use `multiple configurations` to inject values.
- `ClassPathXmlApplicationContext` class also takes `variable no of arguments` as a String array inside its `constructor`.
- The XML configuration path is separated with `comma`.

## Syntax

### application-conf1.xml
`

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

        <bean class="com.multiple.configuration.beans.Programmer" id="programmer">
            <property name="name" value="Sachin"/>
        </bean>

    </beans>
`

---

### application-conf2.xml
`

    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

        <bean class="com.multiple.configuration.beans.Laptop" name="laptop">
            <property name="brand" value="Dell"/>
        </bean>

    </beans>

`

---


### Importing multiple XML configurations
`
    ApplicationContext context =
    new ClassPathXmlApplicationContext("/com/multiple/configuration/resources/application-conf1.xml","/com/multiple/configuration/resources/application-conf2.xml");
`