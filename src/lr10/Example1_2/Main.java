package lr10.Example1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filePath;
        String fileExtension = "";
        boolean fileOpened = false;
        String[] options = {
                "1 - Open file",
                "2 - Add book",
                "3 - Search book",
                "4 - Delete book",
                "5 - Exit"
        };
        int option = 0;
        while (option != 5) {
            option = 0;
            printMenu(options);
            try {
                option = Integer.parseInt(in.nextLine());
                if (option < 1 || option > 5) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInput number between 1 and 5!");
            } catch (NumberFormatException e) {
                System.out.println("\nInput should be an integer between 1 and 5!");
            }
            switch (option) {
                case 1 -> {
                    System.out.print("\nInput file path: ");
                    filePath = in.nextLine();
                    fileExtension = getFileExtension(filePath);
                    fileOpened = openFile(filePath, fileExtension);
                }
                case 2 -> {
                    if (!fileOpened) {
                        System.out.println("\nEnter file path first!");
                        break;
                    }
                    String[] book = new String[3];
                    System.out.print("\nInput book name: ");
                    book[0] = in.nextLine();
                    System.out.print("\nInput author: ");
                    book[1] = in.nextLine();
                    System.out.print("\nInput publication date: ");
                    book[2] = in.nextLine();
                    addElement(book, fileExtension);
                }
                case 3 -> {
                    if (!fileOpened) {
                        System.out.println("\nEnter file path first!");
                        break;
                    }
                    System.out.print("\nInput name of the book or the publication date: ");
                    searchElement(in.nextLine(), fileExtension);
                }
                case 4 -> {
                    if (!fileOpened) {
                        System.out.println("\nEnter file path first!");
                        break;
                    }
                    System.out.print("\nInput name of the book to delete: ");
                    deleteElement(in.nextLine(), fileExtension);
                }
            }
            System.out.println("--------------------------");
        }
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();
        System.out.print("Input number: ");
    }

    public static boolean openFile(String filePath, String fileExtension) {
        switch (fileExtension) {
            case "xml" -> {
                 return XmlEditor.openFile(filePath);
            }
            case "json" -> {
                return JsonEditor.openFile(filePath);
            }
        }
        System.out.println("\nIncorrect file path or file extension!");
        return false;
    }

    public static void addElement(String[] element, String fileExtension) {
        switch (fileExtension) {
            case "xml" -> XmlEditor.addElement(element);
            case "json" -> JsonEditor.addElement(element);
            default -> System.out.println("\nIncorrect file path or extension");
        }
    }

    public static void deleteElement(String element, String fileExtension) {
        switch (fileExtension) {
            case "xml" -> XmlEditor.deleteElement(element);
            case "json" -> JsonEditor.deleteElement(element);
            default -> System.out.println("\nIncorrect file path or extension");
        }
    }

    public static void searchElement(String element, String fileExtension) {
        switch (fileExtension) {
            case "xml" -> XmlEditor.searchElement(element);
            case "json" -> JsonEditor.searchElement(element);
            default -> System.out.println("\nIncorrect file path or extension");
        }
    }

    public static String getFileExtension(String filePath) {
        int lastIndex = filePath.lastIndexOf(".");
        if (lastIndex == -1) {
            return "";
        }
        return filePath.substring(lastIndex + 1);
    }
}
