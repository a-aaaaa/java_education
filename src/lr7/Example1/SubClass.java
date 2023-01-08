package lr7.Example1;

public class SubClass extends SuperClass {

    private String str1;
    private String str2;

    public SubClass(String str) {
        super(str);
    }

    public SubClass(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        String classNameAndValue;
        classNameAndValue = "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + this.getStr() + "\n" +
                "str1 = " + this.getStr1() + "\n" +
                "str2 = " + this.getStr2();
        return classNameAndValue;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
