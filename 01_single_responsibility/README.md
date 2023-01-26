# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

This example is derived from a Tic Tac Toe game. 

You are provided with a generic Board class that does board-related things — it stores the values of spots on the board, returns the board's rows, and prints the board out to the screen. On the surface, everything seems legitimately related to a real-world Board object, but the *Single Responsibility Principle* tells us that this class is actually handling far too many responsibilities.

How would you correct this situation?
