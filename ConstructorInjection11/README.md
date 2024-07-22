# Constructor injection in spring

## Summary
- The `ref` attribute is used to inject non-primitives inside `bean` in spring.
- Difference between Constructor and Setter Injection:

- `Constructor Injection`
  1. Dependencies are `injected` using `constructor` arguments.
  2. `Partial injection` is `not supported`, we `cannot ignore` the property if it is there in `constructor parameter`. All `parameters` of `constructor` must be `injected`.
  3. `Readability` is `poor`, using `name` attribute in `XML` is `optional`.
  4. `Non-parameterized/default` constructor is `not mandatory`.
  5. Does not support `circular dependency`.


---


- `Setter Injection`
  1. Dependencies are `injected` using `setter` methods.
  2. `Partial injection` is `supported`, we `can ignore` any property for injection.
  3. `Readability` is `better`, using `name` attribute in `XML` is `compulsory`.
  4. `Non-parameterized/default` constructor is `mandatory`.
  5. Supports `circular dependency`.