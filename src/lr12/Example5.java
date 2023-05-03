package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String str = "asdlk kopj asjjdj aslkjjjnkl dlknlasknl ddkllasoin ioin onnn oinnlkn asnkl lklnndsanklas";
        String substring = "as";
        List<String> list = List.of(str.split(" "));
        System.out.println("\n" + "String before: " + "\n");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n" + "String after: " + "\n");
        List<String> listAfter = findSubstring(list, substring);
        for (String s : listAfter) {
            System.out.println(s);
        }
    }

    public static List<String> findSubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
