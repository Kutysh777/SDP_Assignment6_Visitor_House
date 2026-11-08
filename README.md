# Assignment 6 Visitor Pattern

## About My Project

I used the Visitor pattern for a house. My house has a wall and a roof. One visitor calculates paint, and another checks their condition. This is a simple example with fixed sample data, not a real construction calculation.

## Project Structure

```text
SDP_Assignment6_Visitor_House
|-- README.md
|-- .gitignore
|-- src
    |-- HouseElement.java
    |-- Wall.java
    |-- Roof.java
    |-- HouseVisitor.java
    |-- PaintVisitor.java
    |-- InspectionVisitor.java
    |-- Main.java
```

## Visitor Components

| Role | Class | What It Does |
| --- | --- | --- |
| Element interface | HouseElement | Declares accept(). |
| Concrete Elements | Wall, Roof | Store data and call the matching visitor method. |
| Visitor interface | HouseVisitor | Declares visitWall() and visitRoof(). |
| Concrete Visitors | PaintVisitor, InspectionVisitor | Calculate paint and check condition. |
| Object structure | house array | Holds the wall and roof for traversal. |
| Client | Main | Creates the elements and visitors, then visits every element. |

## How It Works

Main creates an array of HouseElement objects. It goes through the array with PaintVisitor and then InspectionVisitor. For a wall, accept() calls visitor.visitWall(this). For a roof, accept() calls visitor.visitRoof(this). This is double dispatch: the element chooses the matching visit method, and the visitor object provides the operation.

PaintVisitor uses one liter per 10 square meters for a wall and one liter per 5 square meters for a roof. The values are made up for this example. InspectionVisitor checks whether each part is damaged.

## Clean Code Principles

1. **Meaningful Names:** Wall, PaintVisitor, and visitWall() describe their jobs.
2. **Single Responsibility:** PaintVisitor calculates paint. InspectionVisitor checks condition.
3. **Polymorphism:** accept() and the visitor methods select behavior without instanceof checks.
4. **Encapsulation:** Element fields are private. Visitors read only the needed data through getters; the example shares area and condition but does not let visitors change them.
5. **Open/Closed Principle:** I can add another visitor, such as CostVisitor, without changing Wall or Roof. It must implement both visit methods.

Adding a new element type is different: HouseVisitor and every existing visitor need a new visit method.

## How to Run

Use JDK 8 or later. Open a terminal in the project folder:

```text
javac -d out src/*.java
java -cp out Main
```

In IntelliJ IDEA, open the project folder and run Main.java.

## Expected Output

```text
Wall paint: 4 liters
Roof paint: 12 liters
Wall is in good condition
Roof needs repair
```

## Short Explanation for Defense

Visitor adds operations to house elements. Main calls accept() on each element. The element calls the correct visit method, and the visitor performs its operation. I can add another visitor without changing the element classes.
