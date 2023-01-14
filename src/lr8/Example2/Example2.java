package lr8.Example2;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws IOException {
        File input = new File("src/lr8/Example2/Input.txt");
        File output = new File("src/lr8/Example2/Output.txt");
       try (
               PrintWriter printWriterIn = new PrintWriter(input);
               PrintWriter printWriterOut = new PrintWriter(output);
               BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input)))
       ) {
           input.createNewFile();
           Scanner sc = new Scanner(System.in);
           int lineCount = 2;
           int numberCount = 5;
           for (int i = 0; i < lineCount; i++) {
               System.out.println("Input string: ");
               String s = sc.nextLine();
               printWriterIn.write(s);
               printWriterIn.println();
           }
           for (int i = 0; i < numberCount; i++) {
               System.out.println("Input double number: ");
               double num = sc.nextDouble();
               printWriterIn.write(String.valueOf(num));
               printWriterIn.println();
           }
           printWriterIn.flush();

           output.createNewFile();
           String s;
           for (int i = 0; i < lineCount; i++) {
               s = br.readLine();
               if (i == 1) {
                   printWriterOut.println(s);
               }
           }
           double num;
           for (int i = 0; i < numberCount; i++) {
               s = br.readLine();
               num = Double.parseDouble(s);
               if (num > 0) {
                   printWriterOut.println(num);
               }
           }

       } catch (IOException e) {
           System.out.println("error: " + e);
       }
    }
}
