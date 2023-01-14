package lr8.Example1;

import java.io.*;
import java.util.Scanner;

public class Example1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите имя файла => ");
        String fileName = sc.nextLine();
        try {
            File f1 = new File(fileName);
            f1.createNewFile();
            System.out.println("полный путь файла: " + f1.getAbsolutePath());
            System.out.print("введите количество строк для записи в файл => ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
