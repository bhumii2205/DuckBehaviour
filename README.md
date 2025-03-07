#### Name: Bhoomika Kapde  
#### PRN: 23070126025  
#### Batch: 2023-27  

# Strategy Pattern - Duck Simulator

## Overview

This project demonstrates the **Strategy Pattern** by implementing different behaviors for ducks. The **Strategy Pattern** allows dynamic selection of an algorithm at runtime, promoting flexibility and maintainability. Here, ducks can exhibit different **quacking** and **swimming** behaviors without modifying their core structure.

## Class Structure & Explanation

### **1. Duck (Abstract Class)**

- **`display()`** - Abstract method to define duck appearance.
- **`performQuack()`** - Calls the `Quack()` method of the assigned `QuackBehaviour`.
- **`performSwim()`** - Calls the `Swim()` method of the assigned `SwimBehaviour`.
- **`setQuackBehaviour(QuackBehaviour qb)`** - Allows dynamic assignment of a quacking behavior.
- **`setSwimBehaviour(SwimBehaviour sb)`** - Allows dynamic assignment of a swimming behavior.

### **2. QuackBehaviour (Interface)**

- Defines the **quack behavior**.
- Implemented by:
  - `Quack` - Ducks that quack normally.
  - `Squeak` - Rubber ducks that squeak.

### **3. SwimBehaviour (Interface)**

- Defines the **swimming behavior**.
- Implemented by:
  - `SwimWithLegs` - Ducks that swim.
  - `Floating` - Ducks that float (e.g., Rubber ducks).

### **4. Concrete Duck Classes**

- `MallarDuck` - Implements `Quack` and `SwimWithLegs`.
- `RedHeadDuck` - Implements `Quack` and `SwimWithLegs`.
- `RubberDuck` - Implements `Squeak` and `Floating`.

## How to Run the Project

1. Open the project in **IntelliJ IDEA**.
2. Ensure you have Java installed.
3. Compile and run the `Main.java` file.
4. Expected output:
   ```
   -------
   Im Mallar Duck
   Quack
   I can swim
   -------
   -------
   I'm a red head duck
   Quack
   I can swim
   -------
   -------
   I am a rubber duck
   Squeak
   I am floating
   -------
   ```

