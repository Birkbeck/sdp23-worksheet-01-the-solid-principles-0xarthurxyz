# Interface Segregation Principle

**Clients should not be forced to depend on interfaces they do not use.**

It's easy to get caught in a trap of naming interfaces or abstract classes after real-world things. The problem with this approach is two-fold: 

- the collection of methods defined in the interface increase as one adds more and more functionality of the object to the code (a violation of the Single Responsibility Principle), and 
- implementations of the interface start to require exceptions to the rules of the interface. 

Consider the example here. It may seem reasonable to create a `Bird` interface that outlines the basic features of birds — they can *fly* and they can *shed* their feathers. This works for plenty of birds (like an eagle), but then we want to add penguins to our code. The penguin is technically a bird, but if we set it to implement our `Bird` interface, we have to throw an exception for the `fly()` method. The penguin should not be forced to depend on an action it cannot perform.

How would you correct this situation?
