This is the code from my DP studies. This is a short summary from the book "Head First Design Patterns" by Eric Freeman. I highly recommend this book to everyone who wants to learn the design patterns.

Here all the patterns are structured to stay in their own package. A class in each package named Test<AnythingElse> is a client to test the pattern. This class is a good candidate to dive in, because it has a short description.

Reasons you have had to change code in your application
- requirements change
- any libraries updates
- changing db vendor
- localization needed
The change of requirements is probably the most common reason

What is a design pattern?
Design pattern is a solution to a problem in a context, where
    - context is the recurring situation in which the pattern applies (we have a collection of items)
    - problem is your goal to achieve following the constraints in the context (we need to iterate without exposing the imlementation)
    - the solution is a general design that anyone can apply (encapsulate the iteration into a separate class)

OO principles
    - Identify aspects that vary and separate them from the things which stays the same. (Encapsulate)
    - Program to an interface
    - Favor composition over inheritance - behaviour is composed with the right behaviour object, change behaviour at runtime
    - Strive for loose coupled designs between objects which interact
    - Class is closed for modification, but open for extension
    - Dependency inversion principle - Depend upon abstractions (factory method)
        no variable holding a reference to a concrete class
        no class should derive from a concrete class
        no method should override any base class
    - Principle of least knowledge. Design classes which interact with only immediate friends. Avoid large number of coupled classes.
        Invoke methods that belong to
            The object itself
            Objects passed in as a parameter to the method
            Any object the method creates or instantiates
            Any components of the object
            ! Notice that these guidelines tell us not to call methods on objects that were returned from calling other methods!!
    - Hollywood principle. Don't call us - we call you
    - Code is closed change
    - Principle of least knowledge - talk only to your immediate friends
    - Single responsibility - the class has just one reason to change

Patterns:
    - Strategy defines a family of algorithms, encapsulates each one and makes them interchangeable at runtime.
    - Chain of responsibility is a set of objects which gets the object, handles it and forwards to the next one.
    - Observer defines one to many relationship between objects when one is a publisher and the other are subscribers.
    - Decorator. It attaches additional responsibilities dynamically. Decorators provides a flexible way to subclassing for extending functionality.
    - Factory method defines an interface for creating an object, but lets subclasses decide which implementation to use.
    - Abstract factory provides an interface for creating families of related objects without specifying concrete class.
    - Singleton ensures that the class has just one instance, and provides global point of access it.
    - Command. Encapsulates request as an object, letting you parameterize other objects with different requests.
    - Adapter(Object). Makes two interfaces compatible. Converts interface to invoking another interface, which client expects. (Adapter/Decorator diffs)
            (CLass) - is not possible in Java. Because of the need of multiple inheritance
    - Facade provides a simplified interface to a client; a higher level interface
    - Template. Defines the skeleton of an algorithm declared in a method(final) and moving some steps to subclasses.
    - Iterator Pattern provides a way to access the elements of collection without exposing its underlying representation. It allows to iterate through collections of different types
    - Composite. Allows you combine data structures and make hierarchies into the form of trees
    - State. Allows an object to alter it's behaviour when its internal state changes
        -TIP You could make state objects as static instance variables and share them between different contexts
    - Proxy. Provides a surrogate for another object to control the access()
        - A remote proxy controls access to a remote object.
        - A virtual proxy controls access to a resource that is expensive to create.
        - A protection proxy controls access to a resource based on access rights through the invocation handler.
            - TIP: To force the client use the proxy instead of real object, create it using the factory
    - Compound. Patterns which consists of couple of patterns.
        - MVC(Model-View-Controller). Separation of concepts, where Model is the state, View representation layer and Controller is managing interaction between Model and View.

-    - Bridge. Decouple abstraction from its implementation, so that both can vary independelty (Similiar to Strategy, but without a context class)
-    - Builder. Encapsulate the construction of products and allow it to be constructed in steps.
        ? Constructing objects requires more domain knowledge of the client than when using a Factory.
-    - Flyweight. One instance of the class is manager and provides many instances of another class
-    - Interpreter is to build an interpreter for the language
-    - Mediator. Centralize complex communications and controls between related objects.
-    - Prototype is used when creating a new object is expensive or complicated. (Most of the cases using Clone)
-    - Visitor. Adds behaviour to the composite of objects. Encapsulation is not important and behaviour of "visiting" is separated from the class


Anti-pattern tells you how from a problem move to a BAD solution
    - it tells you why the solution looks so attractive
    - it tells you why the solution is bad in the long term
    - it suggests other patterns that are applicable which may provide good solutions

Read 15,16 again
! create your own iterator with stack p369
