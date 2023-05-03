package lr10.Example1_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonEditor {
    private static JSONObject jsonObject;
    private static String filePath;

    public static boolean openFile(String filePath) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            jsonObject = (JSONObject) obj;
            JsonEditor.filePath = filePath;
            System.out.println("\nFile successfully opened!");
            return true;
        } catch (IOException | ParseException e) {
            System.out.println("\nFailed to open the file!");
            return false;
        }
    }

    public static void addElement(String[] element) {
        JSONArray library = (JSONArray) jsonObject.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title", element[0]);
        newBook.put("author", element[1]);
        newBook.put("year", element[2]);
        library.add(newBook);
        jsonObject.put("books", library);
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("\nFailed to add new book!");
        }
        System.out.println("\nNew book successfully added!");
    }

    public static void deleteElement(String element) {
        JSONArray library = (JSONArray) jsonObject.get("books");
        Iterator iterator = library.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (element.equals(book.get("title")) || element.equals(book.get("year"))) {
                iterator.remove();
                try {
                    writeFile();
                } catch (IOException e) {
                    System.out.println("\nFailed to delete the book!");
                }
                System.out.println("\nBook successfully deleted!");
                return;
            }
        }
        System.out.println("\nNo such book found!");
    }

    public static void searchElement(String element) {
        List<JSONObject> result = new ArrayList<>();
        JSONArray library = (JSONArray) jsonObject.get("books");
        for (Object o : library) {
            JSONObject book = (JSONObject) o;
            if (element.equals(book.get("title")) || element.equals(book.get("year"))) {
                result.add(book);
            }
        }
        if (result.isEmpty()) {
            System.out.println("\nNo books found!");
            return;
        }
        print(result);
    }

    public static void print(List<JSONObject> objectList) {
        for (JSONObject book : objectList) {
            System.out.println("\nBook title: " + book.get("title"));
            System.out.println("Author: " + book.get("author"));
            System.out.println("Publication date: " + book.get("year"));
        }
    }

    public static void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(jsonObject.toJSONString());
    }
}
