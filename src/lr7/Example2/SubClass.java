package lr7.Example2;

public class SubClass extends SuperClass {

    public int num;

    public SubClass(String str, int num) {
        super(str);
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void setStr(String str) {
        super.setStr(str);
    }

}
