package lr7.Example5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("superclass string");
        SubClassInt subClassInt = new SubClassInt("subclassint string", 10);
        SubClassChar subClassChar = new SubClassChar("subclasschar string", 'e');
        superClass.ShowInfo();
        subClassInt.ShowInfo();
        subClassChar.ShowInfo();
        SuperClass superClassRef = subClassInt;
        superClassRef.ShowInfo();
        superClassRef = subClassChar;
        superClassRef.ShowInfo();
    }
}
