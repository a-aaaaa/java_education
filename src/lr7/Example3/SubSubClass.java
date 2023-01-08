package lr7.Example3;

public class SubSubClass extends SubClass {

    public String str;

    public void setValue(int num, char aChar, String str) {
        super.setValue(num, aChar);
        this.str = str;
    }

    public SubSubClass(int num, char aChar, String str) {
        super(num, aChar);
        this.str = str;
    }

    @Override
    public String toString() {
        String classNameAndValue;
        classNameAndValue = "subsub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num + "\n" +
                "char = " + this.aChar + "\n" +
                "str = " + this.str;
        return classNameAndValue;
    }
}
