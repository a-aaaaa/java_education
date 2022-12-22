package lr5.Example1;

public class Main {
    public static void main(String[] args) {
        Character ch = new Character();
        ch.setX('E');
        int charCode = ch.getX();
        System.out.println(charCode);
        ch.printX();
    }
}
