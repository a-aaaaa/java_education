package lr7.Example4;

public class SuperClass {
    public char aChar;

    public SuperClass(char aChar) {
        this.aChar = aChar;
    }

    public SuperClass(SuperClass superClass) {
        aChar = superClass.aChar;
    }
}
