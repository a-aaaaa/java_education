package lr7.Example5;

public class SubClassInt extends SuperClass {
    protected int anInt;

    public SubClassInt(String string, int anInt) {
        super(string);
        this.anInt = anInt;
    }

    public void ShowInfo() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n"
            + "String: " + string + "\n"
            + "Int: " + anInt + "\n");
    }
}
