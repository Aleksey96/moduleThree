public class Stack {

    private Integer[] array;
    private int lastElement;

    Stack(int sizeArray) {
        array = new Integer[sizeArray];
    }

    public Integer[] getArray() {
        return array;
    }

    public void pushElementInStack(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                lastElement = i;
                break;
            }
        }
    }

    public void popElementIsStack() {
        for (int i = lastElement; lastElement >= 0; i--) {
            System.out.println(array[i]);
            array[i] = null;
            lastElement = i--;
        }
    }

    public void pushAllStack() {
        for (int i = 0; i < array.length; i++) {
            int element = (int) (Math.random() * 10 + 1);
            pushElementInStack(element);
        }
    }

    public void printStack() {
        for (Integer element : array) {
            System.out.println(element);
        }
    }
}
