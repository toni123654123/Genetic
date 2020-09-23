package LinkedList;

public class stackOfIStrings {
    public static void satckOfIString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println(stack.size());
        System.out.printf("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println(stack.size());
    }

    public static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.size());
        System.out.printf("2.2 Pop elements form stack");
        while (!stack.isEmpty()){
            System.out.printf("%s", stack.pop());
        }
        System.out.println(stack.size());
    }
}
