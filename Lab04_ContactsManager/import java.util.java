import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public static String formatPhoneNumber(String rawNumber) {

        String digitsOnly = rawNumber.replaceAll("\\D", "");

        if (digitsOnly.length() == 10) {
            return digitsOnly.replaceAll(
                "(\\d{3})(\\d{3})(\\d{4})", 
                "$1-$2-$3"
            );
        }

        return rawNumber;
    }

    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(
            "Alice Smith",
            "alice@email.com",
            formatPhoneNumber("555.999.8888")
        ));

        contacts.add(new Contact(
            "Bob Jones",
            "bob@email.com",
            formatPhoneNumber("(555)111-2222")
        ));

        contacts.add(new Contact(
            "Zack Morris",
            "zack@email.com",
            formatPhoneNumber("5551234567")
        ));

        System.out.println("--- Cleaning Data ---");
        System.out.println("--- Sorting Data ---");
        }

        for (int i = 0; i < contacts.size() -1; i++) {
            for (int j = 0; j <contacts.size() - i - 1; j++) {
                String name1 = contacts.get(j).getName();
                String name2 = contacts.get(j +1).getName();

                if (name1.compareTo(name2) > 0) {
                    Contact temp = contacts.get(j);
                    contacts.set(j + 1, temp);
                }
            }
        }

        for (Contact c : contacts) {
            System.out.println(c);
        }

        System.out.println("--- Search ---");

        Scanner input = new Scanner(System.in):

        System.out.print("Enter a name to find: ");
        String searchName = input.nextLine();

        boolean found = false;

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(searchName)) {
                System.out.println("FOUND: " + c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }

        input.close();
    }
}