package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("super");
        System.out.println("strlength = " + superClassObject.getStr());
        SubClass subClassObject = new SubClass("sub", 10);
        System.out.println("num = " + subClassObject.num);
        System.out.println("strlength = " + subClassObject.getStr());
        subClassObject.setNum(4);
        subClassObject.setStr("subclass");
        System.out.println("num = " + subClassObject.num);
        System.out.println("strlength = " + subClassObject.getStr());
    }
}
