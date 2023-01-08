package lr7.Example5;

public class SuperClass {
    protected String string;

    public SuperClass(String string) {
        this.string = string;
    }

    public void ShowInfo() {
        System.out.println("Class: " + this.getClass().getSimpleName() + "\n"
            + "String: " + string + "\n");
    }
}
