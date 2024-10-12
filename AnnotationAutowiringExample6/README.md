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

    }
`

## Conclusion
- Note, If our bean classes and Configuration class are in the same package, then we can avoid using the basePackages attribute in the `@ComponentScan` annotation.
- If we want to inject a bean not in the current package, then use attribute `basePackages` or `basePackageClasses`.
- The attribute `basePackages` will take `argument` as a string object separated by `comma`.
- The attribute `basePackageClasses` will take the `argument` as `Classes` as an object separated by `comma`.
- The code will throw exception `NoSuchMethodException` since Spring doesn’t know which `constructor to use`, and because there's `no no-argument (default)` constructor, it throws this exception when attempting to `instantiate` the Person bean.
- The solution would be to add default non-parameterized to initialize with default values or annotate constructor taking both Car and name as argument with `@Autowired`.

## Note:
- The jar `spring-aop` is required for annotation processing and let spring automatically scan the bean from `Configuration` class.