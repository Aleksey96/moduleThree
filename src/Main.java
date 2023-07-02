
public class Main {

    public static void add(Stack stack) {
        for (int i = 0; i < 10; i++) {
            stack.addElement((int) (Math.random() * 10 + 1));
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        //stack.pushElementInStack(4);
        //stack.pushElementInStack(1);
        stack.pushAllStack();
        stack.printStack();

        var stackCollection = new Stack();
        add(stackCollection);
        System.out.println(stackCollection);
        System.out.println(stackCollection.isEmpty());

    }
}