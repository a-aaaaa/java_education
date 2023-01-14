package lr8.Example3;

import java.io.*;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws IOException {
        File input = new File("src/lr8/Example3/Input.txt");
        File output = new File("src/lr8/Example3/Output.txt");
        output.createNewFile();
        char[] vowels = {'А', 'а', 'Е', 'е', 'Ё', 'ё', 'И', 'и', 'О', 'о', 'У', 'у', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
        Arrays.sort(vowels);
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
                PrintWriter pw = new PrintWriter(output)
        ) {
            String s;
            StringBuilder stringBuilder = new StringBuilder();
            int lineCount = 0;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (s.equals("")) {
                    continue;
                }
                String[] str = s.split("[ .,;:!?—…]+");
                for (String word: str) {
                    if (Arrays.binarySearch(vowels, word.charAt(0)) < 0) {
                        stringBuilder.append(word).append(" ");
                    }
                }
                pw.println("line " + lineCount + ": " + stringBuilder);
                stringBuilder.setLength(0);
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }
}
