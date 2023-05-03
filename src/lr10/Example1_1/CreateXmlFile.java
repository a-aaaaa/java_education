package lr10.Example1_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXmlFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();
            Element rootElement = document.createElement("library");
            document.appendChild(rootElement);

            Element book1 = document.createElement("book");
            rootElement.appendChild(book1);

            Element title1 = document.createElement("title");
            title1.appendChild(document.createTextNode("Война и мир"));
            book1.appendChild(title1);

            Element author1 = document.createElement("author");
            author1.appendChild(document.createTextNode("Лев Толстой"));
            book1.appendChild(author1);

            Element year1 = document.createElement("year");
            year1.appendChild(document.createTextNode("1869"));
            book1.appendChild(year1);

            Element book2 = document.createElement("book");
            rootElement.appendChild(book2);

            Element title2 = document.createElement("title");
            title2.appendChild(document.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);

            Element author2 = document.createElement("author");
            author2.appendChild(document.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);

            Element year2 = document.createElement("year");
            year2.appendChild(document.createTextNode("1967"));
            book2.appendChild(year2);

            document.setXmlStandalone(true);
            document.normalizeDocument();
            javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(document);
            javax.xml.transform.stream.StreamResult result = new StreamResult(new File("src/lr10/Example1_2/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успепшно создан");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
