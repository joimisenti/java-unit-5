package academy.learnprogramming.linkedlists;

import academy.learnprogramming.stacks.ArrayStack;
import academy.learnprogramming.stacks.Employee;

public class Main {

    public static void main (String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();

//        System.out.println(stack.peek());
        // peek only gets the item at the top of the stack; it does not remove the item like pop
        // the stack remains unchanged
//        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Now peek gets the next item on the stack after pop:\n" + stack.peek());
    }
}
