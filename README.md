# Strategy pattern ducks course book

This project demonstrates the implementation of the Strategy design pattern using a Duck simulation.

## Overview

The Duck Strategy Pattern project focuses on modeling different types of ducks and their behaviors. The goal is to show how behavior can be encapsulated and easily swapped at runtime using the Strategy pattern.

## Code Structure

The project consists of the following classes:

- `Duck`: An abstract class representing a generic duck with common properties and behaviors.
- `FlyBehavior`: An interface defining the fly behavior contract.
- `QuackBehavior`: An interface defining the quack behavior contract.
- Concrete implementations of different duck types, such as `MallardDuck`, `RedheadDuck`, `RubberDuck`, and `DecoyDuck`.
- Concrete implementations of fly and quack behaviors, including `FlyWithWings`, `FlyNoWay`, `FlyRocketPowered`, `Quack`, `Squeak`, and `MuteQuack`.

## Git Tags

Git tags have been used to identify the different steps in deducing the pattern. Some of the key tags are as follows:

- `2.5-Interface-solution`: Introducing interfaces for fly and quack behaviors.
- `3.0-Strategy-DP-Initial`: First partial implementation of the strategy pattern with behavior delegation support.
- `3.1-Strategy-Pattern`: Complete implementation of the strategy pattern with delegated fly and quack behaviors.
- `3.2-Dynamic-redefinition`: Dynamic behavior redefinition on the fly.

## App.java

This `App.java` file serves as an example to showcase the implementation and usage of various duck objects and their behaviors in the strategy pattern.

```
Hello World!
-------------------------
All ducks float, even decoys!
I'm a real Mallard duck
I'm flying!!
Quack
-------redefine fly------------------
I'm flying with a rocket!
-------------------------
All ducks float, even decoys!
I'm a real Redhead duck
I'm flying!!
Quack
-------------------------
All ducks float, even decoys!
I'm a rubber duckie
I can't fly
Squeak
-------------------------
All ducks float, even decoys!
I'm a wooden decoy duck
I can't fly
<< Silence >>
```
