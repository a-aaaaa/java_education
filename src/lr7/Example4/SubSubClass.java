package lr7.Example4;

public class SubSubClass extends SubClass{
    public int anInt;

    public SubSubClass(char aChar, String string, int anInt) {
        super(aChar, string);
        this.anInt = anInt;
    }

    public SubSubClass(SubSubClass subSubClass) {
        super(subSubClass);
        anInt = subSubClass.anInt;
    }
}
