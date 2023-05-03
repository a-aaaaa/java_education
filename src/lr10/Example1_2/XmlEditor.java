package lr10.Example1_2;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlEditor {
    private static Document document;
    private static String filePath;

    public static boolean openFile(String filePath) {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            document = documentBuilder.parse(filePath);
            XmlEditor.filePath = filePath;
            System.out.println("\nFile successfully opened!");
            return true;
        } catch (Exception e) {
            System.out.println("\nFailed to open the file!");
            return false;
        }
    }

    public static void addElement(String[] book) {
        Element rootElement = document.getDocumentElement();
        Element newBook = document.createElement("book");
        rootElement.appendChild(newBook);

        Element title = document.createElement("title");
        title.appendChild(document.createTextNode(book[0]));
        newBook.appendChild(title);

        Element author = document.createElement("author");
        author.appendChild(document.createTextNode(book[1]));
        newBook.appendChild(author);

        Element year = document.createElement("year");
        year.appendChild(document.createTextNode(book[2]));
        newBook.appendChild(year);

        try {
            writeFile(filePath);
        } catch (TransformerException e) {
            System.out.println("\nFailed to add new book!");
        }
        System.out.println("\nNew book successfully added!");
    }

    public static void deleteElement(String bookName) {
        NodeList books = document.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Node currentNode = books.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                Element book = (Element) currentNode;
                if (book.getElementsByTagName("title").item(0).getTextContent().equals(bookName)) {
                    currentNode.getParentNode().removeChild(currentNode);
                    try {
                        writeFile(filePath);
                    } catch (TransformerException e) {
                        System.out.println("\nFailed to delete the book!");
                    }
                    System.out.println("\nBook successfully deleted!");
                    return;
                }
            }
        }
        System.out.println("\nNo such book found!");
    }

    public static void searchElement(String element) {
        List<Element> result = new ArrayList<>();
        NodeList books = document.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Node currentNode = books.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                Element book = (Element) currentNode;
                if (book.getElementsByTagName("title").item(0).getTextContent().equals(element) ||
                    book.getElementsByTagName("year").item(0).getTextContent().equals(element)) {
                    result.add(book);
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("\nNo books found!");
        }
        else {
            print(result);
        }
    }

    public static void print(List<Element> elements) {
        for (Element element : elements) {
            System.out.println("\nBook title: "
                    + element.getElementsByTagName("title").item(0)
                    .getTextContent());
            System.out.println("Author: "
                    + element.getElementsByTagName("author").item(0)
                    .getTextContent());
            System.out.println("Publication date: "
                    + element.getElementsByTagName("year").item(0)
                    .getTextContent());
        }
    }

    public static void removeWhitespaces(Element element) {
        NodeList children = element.getChildNodes();
        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);
            if (child instanceof Text && ((Text) child).getData().trim().isEmpty()) {
                element.removeChild(child);
            } else if (child instanceof Element) {
                removeWhitespaces((Element) child);
            }
        }
    }

    public static void writeFile(String filePath) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filePath));
        removeWhitespaces(document.getDocumentElement());
        transformer.transform(source, result);
    }
}
