package lr8.Example1;

import java.io.*;

public class Example1_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                    new FileInputStream("C:\\tmp\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\tmp\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
