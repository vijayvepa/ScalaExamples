# Scala Examples

## Install

See [Scala Getting Started](https://docs.scala-lang.org/getting-started/index.html)

## Creating new project

### Using SBT

```shell

sbt new scala/scala3.g8

```

### Using Gradle

See [Gradle Scala](https://docs.gradle.org/current/samples/sample_building_scala_applications.html)

```shell
$ gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 5

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Project name (default: demo):
Source package (default: demo):


BUILD SUCCESSFUL
2 actionable tasks: 2 executed
```

- See [GradleHelloWorld](./GradleHelloWorld/README.md) for next steps