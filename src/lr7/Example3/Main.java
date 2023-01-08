package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass(10);
        System.out.println(superClassObject);
        SubClass subClassObject = new SubClass(7, 'y');
        System.out.println(subClassObject);
        SubSubClass subSubClassObject = new SubSubClass(2, 'e', "string");
        System.out.println(subSubClassObject);
    }
}
