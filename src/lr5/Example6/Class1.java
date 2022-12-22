package lr5.Example6;

public class Class1 {
    private int min;
    private int max;

    public Class1(int num) {
        if (num >= max) {
            min = max;
            max = num;
        }
        else {
            min = num;
        }
    }

    public Class1(int num1, int num2) {
        min = Math.min(Math.min(num1, num2), min);
        max = Math.max(Math.max(num1, num2), max);
    }

    public void setValue(int num) {
        if (num >= max) {
            min = max;
            max = num;
        }
        else {
            min = num;
        }
    }

    public void setValue(int num1, int num2) {
        min = Math.min(Math.min(num1, num2), min);
        max = Math.max(Math.max(num1, num2), max);
    }

    public void printValue() {
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
