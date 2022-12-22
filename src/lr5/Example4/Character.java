package lr5.Example4;

public class Character {
    public char ch;
    public int code;

    public Character(char ch, int code) {
        this.ch = ch;
        this.code = code;
    }

    public Character(double num) {
        code = (int) (num * 100) % 100;
        ch = (char) num;
    }
}
