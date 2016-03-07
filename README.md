GOF Design Patterns Implementations

Creational patterns - concern the process of object creation.
--------------------------------------------------------------
1. Factory Method - Define an interface for creating an object, but let subclasses decide which class to instantiate.
    Factory Method lets a class defer instantiation to subclasses.
    Note: Returns various instances, Multiple constructors, Interface driven, Adaptable to environment more easily
    Examples: java.util.Calendar, java.util.ResourceBundle, java.text.NumberFormat

2. Abstract Factory - Provide an interface for creating families of related or dependent objects without specifying their
   concrete classes.
   Note: Implemented with a Factory, Hides the Factory, Abstracts Environment, Build through Composition
   Examples: javax.xml.parsers.DocumentBuilderFactory

3. Builder - Separate the construction of a complex object from its representation so that the same construction process
   can create different representations.
   Note: Handles complex constructors, large number of parameters, immutability
   Example: java.lang.StringBuilder

4. Prototype - Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this
   prototype. Prototype is often an alternative to Abstract Factory.

5. Singleton - Ensure a class only has one instance, and provide a global point of access to it.
    Note: getInstance method shouldn't contains any arguments, otherwise it should me Factory patterns.
    Example: java.lang.Runtime


Structural patterns deal with the composition of classes or objects.
--------------------------------------------------------------

6. Adapter - Convert the interface of a class into another interface clients expect. Adapter lets classes work together
   that couldn't otherwise because of incompatible interfaces.
   Note: Works after code is designed, Legacy
   Example: Arrays -> Lists (not exactly, just functionality...), Streams.

7. Bridge - Decouple an abstraction from its implementation so that the two can vary independently.
   Concepts:
   - Decouple Abstraction and implementation
   - Encapsulation, Composition, Inheritence
   - Changes in Abstraction won't affect client
   - Details won't be right
   Examples: JDBC Driver (DriverManager.registerDriver())...

8. Composite - Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
   individual objects and compositions of objects uniformly. Composite is often used with Iterator or Visitor.

9. Decorator - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to
   subclassing for extending functionality. Structure diagrams of Composite and Decorator are similar

10. Facade - Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that
    makes the subsystem easier to use.

11. Flyweight - Use sharing to support large numbers of fine-grained objects efficiently.

12. Proxy - Provide a surrogate or placeholder for another object to control access to it.


Behavioral patterns characterize the ways in which classes or objects interact and distribute responsibility.
--------------------------------------------------------------

13. Interpreter - Given a language, define a represention for its grammar along with an interpreter that uses the
    representation to interpret sentences in the language.

14. Template Method - Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
    Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

15. Chain of Responsibility - Avoid coupling the sender of a request to its receiver by giving more than one object a chance
    to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

16. Command - Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or
    log requests, and support undoable operations.

17. Iterator - Provide a way to access the elements of an aggregate object sequentially without exposing its underlying
    representation.

18. Mediator - Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping
    objects from referring to each other explicitly, and it lets you vary their interaction independently.

19. Memento - Without violating encapsulation, capture and externalize an object’s internal state so that the object can be
    restored to this state later.

20. Observer - Define a one-to-many dependency between objects so that when one object changes state, all its dependents are
    notified and updated automatically.

21. State - Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

22. Strategy - Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the
    algorithm vary independently from clients that use it.

23. Visitor - Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new
    operation without changing the classes of the elements on which it operates.

========================================================================================================================

Design aspects that design patterns let you vary:

Creational patterns:
--------------------------------------------------------------
1. Factory Method - subclass of object that is instantiated
2. Abstract Factory - families of product objects
3. Builder - how to composite object gets created
4. Prototype - class of object that is instantiated
5. Singleton - the sole instance of a class

Structural patterns:
--------------------------------------------------------------
6. Adapter - interface to an object
7. Bridge - implementation of an object
8. Composite - structure and composition of an object
9. Decorator - responsibilities of an object without subclassing
10. Facade - interface to a subsystem
11. Flyweight - storage costs of objects
12. Proxy - how to object is accessed; its lication

Behavioral patterns:
--------------------------------------------------------------
13. Interpreter - grammar and interpretation of a language
14. Template Method - steps of an algorithm
15. Chain of Responsibility - object that can fulfill a request
16. Command - when and how a request is fullfilled
17. Iterator - how an aggregate's elements are accessed, traversed
18. Mediator - how and which objects interact with each other
19. Memento - what private information is stored outside an object, and when
20. Observer - number of objects that depend on another object; how the dependent objects stay up to date
21. State - states of an object
22. Strategy - an algorithm
23. Visitor - operations that can be applied to object(s) without changing their class(es)