# design-patterns

This is the code from my Design Patterns(DP) studies. This is a short summary from the book "Head First Design Patterns" by Eric Freeman. I highly recommend this book to everyone who wants to learn the design patterns.
Patterns are structured to stay in their own package. A class in each package named Test<AnythingElse> is a client to test the pattern. This class is a good candidate to dive in, because it has a short description.

Reasons you have had to change code in your application:
1. Requirements change
2. Library updates
3. DB vendor change
4. Localization needed

The change of requirements is probably the most common reason.

## What is a design pattern?
Design pattern is a **solution** to a **problem** in a **context**, where
    * **context** is the recurring situation in which the pattern applies. E.g. "we have a collection of items".
    * **problem** is your goal to achieve following the constraints in the context. E.g. "we need to iterate without exposing the implementation".
    * **solution** is what you’re after: a general design that anyone can apply which resolves the goal and set of constraints. (encapsulate the iteration into a separate class)

## OO principles
   * Identify aspects that vary and separate them from the things which stays the same. (Encapsulate)
    * Program to an interface.
    * Favor composition over inheritance.
    * Strive for loose coupled designs between objects which interact.
    * Class is closed for modification, but open for extension.
    * Dependency inversion principle - depend upon abstractions (factory method).
        * No variable holding a reference to a concrete class.
        * No class should derive from a concrete class.
        * No method should override any base class.
    * Principle of least knowledge. 
        * Design classes which interact with only immediate friends. 
        * Avoid large number of coupled classes.
        * Invoke methods that belong to:
            * the object itself,
            * objects passed in as a parameter to the method,
            * any object the method creates or instantiates,
            * any components of the object.
            ! Notice that these guidelines tell us not to call methods on objects that were returned from calling other methods!!
    * Hollywood principle. Don't call us - we call you.
    * Code is closed change.
    * Principle of least knowledge - talk only to your immediate friends.
    * Single responsibility - the class has just one reason to change.

## Patterns:
   * **Strategy** defines a family of algorithms, encapsulates each one and makes them interchangeable at runtime.
    * **Chain** of responsibility is a set of objects which gets the object, handles it and forwards to the next one.
    * **Observer** defines one to many relationship between objects when one is a publisher and the other are subscribers.
    * **Decorator** provides a flexible way to subclassing for extending functionality.
    * **Factory** method defines an interface for creating an object, but lets subclasses decide which implementation to use.
    * **Abstract** factory provides an interface for creating families of related objects without specifying concrete class.
    * **Singleton** ensures that the class has just one instance, and provides global point of access it.
    * **Command** encapsulates request as an object, letting you parameterize other objects with different requests.
    * **Adapter** makes two interfaces compatible. Converts interface to invoking another interface, which client expects.
    * **Facade** provides a simplified interface to a client; a higher level interface
    * **Template** Defines the skeleton of an algorithm declared in a method(final) and moving some steps to subclasses.
    * **Iterator** Pattern provides a way to access the elements of collection without exposing its underlying representation. It allows to iterate through collections of different types.
    * **Composite** allows you combine data structures and make hierarchies into the form of trees.
    * **State** allows an object to alter it's behaviour when its internal state changes.
        - TIP: you could make state objects as static instance variables and share them between different contexts.
    * **Proxy** provides a surrogate for another object to control the access. Types of proxy are:
        * **Remote** proxy controls access to a remote object,
        * **Virtual** proxy controls access to a resource that is expensive to create,
        * **Protection** proxy controls access to a resource based on access rights through the invocation handler.
        - TIP: To force the client use the proxy instead of real object, create it using the factory
    * **Compound** patterns consist of couple or more of patterns.
        * **MVC**(Model-View-Controller). Separation of concepts, where Model is the state, View representation layer and Controller is managing interaction between Model and View.

### The next patterns are not in the repository.
   * **Bridge** decouples abstraction from its implementation, so that both can vary independently(Similar to Strategy, but without a context class).
    * **Builder** encapsulates the construction of products and allow it to be constructed in steps.
        - Constructing objects requires more domain knowledge of the client than when using a Factory.
    * **Mediator** centralize complex communications and controls between related objects.
    * **Prototype** is used when creating a new object is expensive or complicated. Most of the cases using Clone.
