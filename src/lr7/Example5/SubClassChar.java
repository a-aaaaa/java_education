package lr7.Example5;

public class SubClassChar extends SuperClass {
    protected char aChar;

    public SubClassChar(String string, char aChar) {
        super(string);
        this.aChar = aChar;
    }

    public void ShowInfo() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n"
            + "String: " + string + "\n"
            + "Char: " + aChar + "\n");
    }
}
