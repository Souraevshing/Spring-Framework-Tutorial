# AnnotationAutoWiring in Spring

## Summary
- Annotation in Spring is used to automatically inject values at runtime.
- The `@Configuration` annotation in Spring is used to indicate that a class is a source of configuration for the `Spring IoC (Inversion of Control)` container.
- In simple words, we can say that it tells Spring that this class is intended to be used as a `configuration` class in place of `XML`.
- Annotations are used for `java-based` configuration opposite to `XML` configuration.

## Steps
- Create a class with `@Component` annotation which will act as `bean`.
- Create a class with `@Configuration` annotation which will inform the `Spring container` that this class can be used as `Configuration` class.
- Along with `@Configuration` also use `@ComponentScan` annotation with the `basePackages` attribute containing names of `one or more base packages` where Spring should look for these `annotated components`.
- Start the Spring IoC container by instantiating AnnotationConfigApplicationContext passing it the name of Configuration class.
- Finally, retrieve the bean using the `getBean()` method.

## Syntax (Using basePackages)

`

    @Configuration
    @ComponentScan(basePackages = "com.autowire.demo.beans")
    public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig cons called");
    }

    @Bean
    public Car car1() {
        return new Car("Maruti Suzuki Dzire");
    }

    @Bean
    public Car car2() {
        return new Car("Honda Amaze");
    }

    }
`

## Using @Bean Annotation
- Till now, along with `@Configuration`, we used `@ComponentScan and @Component` annotations also.
- But Spring `allows` us to create beans `without` `@Component and @ComponentScan` annotations.
- This is done by using `@Bean` annotation.
- The @Bean annotation is a `method level` annotation.
- When we apply this on a method, then it `indicates` that the method produces a bean to be `managed by the Spring container`.
- It is typically used in classes annotated with `@Configuration`, but it can also be used in other contexts.
- Using `@Bean` annotation the `name/id` of method will be `same as that of method name`, but we can change or `override` the name by passing optional attribute `name`.

## Conclusion
- Note, If our bean classes and Configuration class are in the same package, then we can avoid using the basePackages attribute in the `@ComponentScan` annotation.
- If we want to inject a bean not in the current package, then use attribute `basePackages` or `basePackageClasses`.
- The attribute `basePackages` will take `argument` as a string object separated by `comma`.
- The attribute `basePackageClasses` will take the `argument` as `Classes` as an object separated by `comma`.
- Spring’s `@Autowired` annotation has an `optional attribute` called required. By `default`, this attribute is set to `true`, meaning that Spring expects the `dependency to be available`.
- The code will throw since Spring will face ambiguity which bean is to use. 

## Solution
### To resolve the above exception `NoUniqueBeanDefinitionException` add `@Qualifier` in the constructor taking Car as argument or add `@Primary` to any one of the beans to inject that bean and resolving ambiguity.
#### Update the code for AppConfig as below:

`

    @Configuration
    @ComponentScan(basePackages = "com.autowire.demo.beans")
    public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig cons called");
    }

    @Primary    // this bean will be injected
    @Bean
    public Car car1() {
        return new Car("Maruti Suzuki Dzire");
    }

    @Bean
    public Car car2() {
        return new Car("Honda Amaze");
    }

    }
`
### Or update the Person constructor code:
`

    @Component
    public class Person {

    private String name = "Sourav";
    private Car car;

    // now this constructor will let spring to inject bean with name car1 
    public Person(@Qualifier("car1")Car car) {
        this.car = car;
        System.out.println("Person cons called, Car setter called");
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        if (car==null) {
            System.out.println("No Car");
        } else {
            System.out.printf("Car: %s\n", car.getCarName());
        }
    }

    }
`

## Note:
- The jar `spring-aop` is required for annotation processing and let spring automatically scan the bean from `Configuration` class.