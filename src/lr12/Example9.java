package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String str = "as3dlk kop.j asjjdj aslkjjjnkl dlknlasknl ddk21llasoin ioin onnn oinn4dlkn asnkl lk```lnndsanklas";
        List<String> list = List.of(str.split(" "));
        System.out.println("\n" + "String before: " + "\n");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n" + "String after: " + "\n");
        List<String> listAfter = findAlphabetic(list);
        for (String s : listAfter) {
            System.out.println(s);
        }
    }

    public static List<String> findAlphabetic(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("^[a-zA-Z]*$"))
                .collect(Collectors.toList());
    }
}
