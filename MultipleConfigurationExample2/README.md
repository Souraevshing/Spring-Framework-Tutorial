# Importing multiple XML configuration inside another main XML configuration

## Summary
- Spring also gives developers a way to import multiple configurations into one main configuration.
- And then we update the `ClassPathXmlApplicationContext` class constructor path with that main configuration XML path.
- We use `<import resource="..." />` tag to import configuration into main configuration.

## Syntax
`
    
    <import resource="application-conf1.xml"/>
    <import resource="application-conf2.xml"/>
`