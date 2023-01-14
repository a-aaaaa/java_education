package lr8.Example1;

import java.io.*;
import java.util.Scanner;

public class Example1_4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\tmp\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("введите числа:");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.close();
            wr.flush();

            File f2 = new File("C:\\tmp\\numRez.txt");
            f2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("число " + number);
                }
            } catch (EOFException e) {

            }
            wr.close();
            wr.flush();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
