# Programming Language Builder

## What the product is

This project creates a `ProgrammingLanguage` object using the **Builder Design Pattern**.

The example creates a Java programming language with these properties:

* `name` — `String`
* `version` — `float`
* `popularity` — `int`
* `staticallyTyped` — `Boolean`
* `jobDemand` — `int`

## Basic Structure

* **ProgrammingLanguage** — the main product class. It stores the programming language properties.
* **ProgrammingLanguageBuilder** — an interface that contains the methods needed to build a programming language.
* **JavaBuilder** — implements the builder and sets the values for Java.
* **Director** — controls the order in which the Java object is built.
* **Main** — runs the program and prints the result.

## Clean Code

### 1. Meaningful Names

Names describe what the code is used for.

```java
ProgrammingLanguage programmingLanguage;
```

instead of:

```java
ProgrammingLanguage p;
```

Methods also have clear names:

```java
setJobDemand();
setStaticallyTyped();
```

### 2. Small Methods

Each builder method does one simple thing.

```java
public ProgrammingLanguageBuilder setName(String name) {
    progLang.setName(name);
    return this;
}
```

Another example:

```java
public ProgrammingLanguageBuilder setPopularity(int popularity) {
    progLang.setPopularity(popularity);
    return this;
}
```

Each method only sets one property.

### 3. Consistent Formatting

The methods use the same structure and indentation.

```java
public ProgrammingLanguageBuilder setVersion(float version) {
    progLang.setVersion(version);
    return this;
}
```

```java
public ProgrammingLanguageBuilder setJobDemand(int jobDemand) {
    progLang.setJobDemand(jobDemand);
    return this;
}
```

This makes the code easier to read.

### 4. Validated Construction

The `build()` method checks that all required values were provided.

```java
if (progLang.getName() == null
        || progLang.getVersion() == 0
        || progLang.getPopularity() == 0) {
    throw new IllegalStateException("Invalid state");
}
```

It also checks the other required properties:

```java
|| progLang.getJobDemand() == 0
|| progLang.getStaticallyTyped() == null
```

This prevents an incomplete object from being built.

### 5. No Magic Numbers

The values can be given meaningful names instead of using unexplained numbers.

```java
private static final int JAVA_JOB_DEMAND = 3;
```

Then it can be used like this:

```java
.setJobDemand(JAVA_JOB_DEMAND)
```

This makes it clearer what the number represents.

## Example Output

```text
Name: Java, Version: 23.0, Popularity: 4, Statically typed: true, Job demand: 3
```
