package academy.learnprogramming.stacks;

import academy.learnprogramming.linkedlists.LinkedStack;

public class Main {

    public static void main (String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();

        System.out.println(stack.peek());
        // peek only gets the item at the top of the stack; it does not remove the item like pop
        // the stack remains unchanged
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Now peek gets the next item on the stack after pop:\n" + stack.peek());
    }
}
