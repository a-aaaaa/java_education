package lr7.Example4;

public class SubClass extends SuperClass{
    public String string;

    public SubClass(char aChar, String string) {
        super(aChar);
        this.string = string;
    }

    public SubClass(SubClass subClass) {
        super(subClass);
        string = subClass.string;
    }
}
