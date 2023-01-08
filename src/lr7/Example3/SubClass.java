package lr7.Example3;

public class SubClass extends SuperClass {

    public char aChar;

    public void setValue(int num, char aChar) {
        super.setValue(num);
        this.aChar = aChar;
    }

    public SubClass(int num, char aChar) {
        super(num);
        this.aChar = aChar;
    }

    @Override
    public String toString() {
        String classNameAndValue;
        classNameAndValue = "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num + "\n" +
                "char = " + this.aChar;
        return classNameAndValue;
    }
}
