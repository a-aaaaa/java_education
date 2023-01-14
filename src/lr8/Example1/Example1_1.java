package lr8.Example1;

import java.io.File;

public class Example1_1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("создан");
                System.out.println("полный путь1: " + f1.getAbsolutePath());
            }
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("полный путь2: " + f2.getAbsolutePath());

            File f3 = new File("E:\\folder1\\folder2\\folder3");
            f3.mkdirs();
            System.out.println("полный путь3: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("ошибка: " + e);
        }
    }
}
