package lr6.Example1;

public class Class1 {
    public char ch;
    public String str;

    public void setValue(char ch) {
        this.ch = ch;
    }

    public void setValue(String str) {
        this.str = str;
    }

    public void setValue(char[] charArray) {
        if (charArray.length == 1) {
            ch = charArray[0];
            return;
        }
        str = new String(charArray);
    }
}
