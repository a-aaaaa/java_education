package lr7.Example2;

public class SuperClass {
    private String str;

    public SuperClass(String str) {
        this.str = str;
    }

    SuperClass() {

    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setStr() {
        str = "empty string";
    }

    final int getStr() {
        return str.length();
    }
}
