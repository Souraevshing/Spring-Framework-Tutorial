# Circular dependency in spring

## Summary
- `Circular dependency` is a `situation` in Spring when `two or more` beans `depend` on each other.
- For example, when Bean A requires Bean B to perform its functions, and Bean B, in turn, requires Bean A for its operations.
- Now if we try to use `constructor injection` for the above Circular dependent beans, then Spring will throw an exception called `BeanCurrentlyInCreationException`.

`
	
    
    <bean class="in.scalive.beans.Teacher" id="t1">
        <constructor-arg ref="s1"/>
	</bean>
	<bean class="in.scalive.beans.Student" id="s1"> 
		<constructor-arg ref="t1"/>
	</bean>


`

To solve this, spring gives us 3 approaches to solve circular dependency
- Setter Injection
- Using `@Lazy` annotation
- Using `@PostConstruct` annotation

## Syntax
`

    <bean class="com.circulardependency.demo.beans.Teacher" id="teacher">
        <property name="name" value="Mr.Kumar"/>
        <property name="useStudent" ref="useStudent"/>
    </bean>

    <bean class="com.circulardependency.demo.beans.Student" id="useStudent">
        <property name="name" value="Naveen"/>
        <property name="teacher" ref="teacher"/>
    </bean>
`

- Note: Above XML configuration is using `setter injection` to resolve the circular dependency issue.