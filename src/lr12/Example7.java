package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String str = "asdlk kopj asjjdj aslkjjjnkl dlknlasknl ddkllasoin ioin onnn oinnlkn asnkl lklnndsanklas";
        List<String> list = List.of(str.split(" "));
        System.out.println("\n" + "String before: " + "\n");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n" + "String after: " + "\n");
        List<String> listAfter = findStrings(list, 6);
        for (String s : listAfter) {
            System.out.println(s);
        }
    }

    public static List<String> findStrings(List<String> strings, int length) {
        return strings.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}
