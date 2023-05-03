package lr10.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.*;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try {
            String filePath = "src/lr10/Example3/file.txt";
            Document document = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Elements newsParent = document.select("body > table > tbody > tr > td > div > table " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody " +
                    "tr > td:nth-child(1)");

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    Node blocktitle = ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0);
                    Node blockdate = ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0);
                    System.out.println("Тема: " + blocktitle);
                    System.out.println("Дата: " + blockdate + "\n");
                    bufferedWriter.write(blocktitle.toString() + "\n");
                    bufferedWriter.write(blockdate.toString() + "\n\n");
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
