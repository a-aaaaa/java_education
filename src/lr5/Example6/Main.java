package lr5.Example6;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1(15);
        class1.printValue();
        class1.setValue(4);
        class1.printValue();
        class1.setValue(16, 9);
        class1.printValue();
        class1.setValue(-4, 20);
        class1.printValue();
    }
}
