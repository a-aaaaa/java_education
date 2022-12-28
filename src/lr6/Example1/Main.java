package lr6.Example1;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.setValue('o');
        System.out.println(class1.ch + " " + class1.str);
        class1.setValue("eeeeeeee");
        System.out.println(class1.ch + " " + class1.str);
        char[] charArray = {'r'};
        class1.setValue(charArray);
        System.out.println(class1.ch + " " + class1.str);
        char[] charArray1 = {'q', 'p', 'c'};
        class1.setValue(charArray1);
        System.out.println(class1.ch + " " + class1.str);
    }
}
