package lr7.Example3;

public class SuperClass {

    public int num;

    public void setValue(int num) {
        this.num = num;
    }

    public SuperClass(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String classNameAndValue;
        classNameAndValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + this.num;
        return classNameAndValue;
    }
}
