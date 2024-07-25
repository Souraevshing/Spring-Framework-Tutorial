# PNamespace inside spring

## Summary
- `Namespace` is a collection of `library` which is a collection of `tags/properties`.
- Just like we have `package in Java` which is a `collection of classes/interfaces`, similarly, we have the concept of `namespace` in XML.
- In XML, a `namespace is a library`, which is a collection of `tags/properties`.
- To use those `tags/properties`, we have to `include` the respective `namespace` in our `XML` configuration file.
- Some examples are as follows:
  - [Beans package] (http://www.springframework.org/schema/beans)
  - [Utils package] (http://www.springframework.org/schema/util)
  - [Property package] (http://www.springframework.org/schema/p)
  - [Constructor package] (http://www.springframework.org/schema/c)


---

## Introduction to P:Namespace

- P:Namespace
  - While using `setter injection`, we use `<property>` tag, one `per setter` method.
  - This means that if our bean has 10 `properties/setters`, we will have to use `10 <property> tags`.
  - This makes our code `lengthy and unmanageable`.
  - To `overcome` this Spring has introduced the concept of `p:namespace`.
  - In Spring XML, `p-namespace` is the XML `shortcut for <property>` tag to inject bean dependency.
  - The `p-namespace replaces <property>` tag in XML configuration.
  - It is `easier` and `clear` to `use` and `increases` the `readability` of XML configuration.
  - To use p-namespace, we first have to add the following `xmlns:p` at the top in our XML schema:
    - `xmlns:p="http://www.springframework.org/schema/p"`
  - Example:
    - Once we do this, we can now `remove` the `<property>` tag and pass the values in the `<bean>` tag itself using the following syntax:
    - `<bean class="…" id="…" p:prop_Name="…" p:prop_Name="..">`
    - On adding the code in XML configuration, the term `prop_Name` will `replace` actual name of `property` as shown below:
      - `p:roll="100"`