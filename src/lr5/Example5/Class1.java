package lr5.Example5;

public class Class1 {
    private int num;

    public Class1() {
        num = 0;
    }

    public Class1(int num) {
        if (num < 100) {
            this.num = num;
            return;
        }
        this.num = 100;
    }

    public void setNum() {
        num = 0;
    }

    public void setNum(int num) {
        if (num < 100) {
            this.num = num;
            return;
        }
        this.num = 100;
    }

    public void printNum() {
        System.out.println(num);
    }
}
