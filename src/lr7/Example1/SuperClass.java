package lr7.Example1;

public class SuperClass {
    private String str;

    public SuperClass(String str) {
        this.str = str;
    }

    public SuperClass() {

    }

    @Override
    public String toString() {
        String superClassNameAndValue;
        superClassNameAndValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + this.getStr();
        return superClassNameAndValue;
    }

    public String getStr() {
        return str;
    }

    public void setStr() {
        this.str = str;
    }
}
