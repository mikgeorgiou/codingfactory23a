package gr.aueb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MobileContactsApp {

    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    final static Path path = Paths.get("C:/tmp/log-mobile.txt");

    public static void main(String[] args) {

    }




















    public static String[][] getAllContactsService() {
       try {
           String[][] contactsList = getAllContacts();
           if (contactsList.length == 0) {
               throw new IllegalArgumentException("List is empty");
           }
           return contactsList;
       } catch (IllegalArgumentException e) {
           log(e);
           throw e;
       }
    }

    public static void insertContactService(String firstname, String lastname, String phoneNumber) {
      try {
          if (insert(firstname, lastname, phoneNumber)) {
              throw new IllegalArgumentException("Error in insert");
          }
      } catch (IllegalArgumentException e) {
          log(e);
          throw e;
      }
    }

    /*
     *  CRUD Services that are provided to
     *  Service Layer.
     */



    public static int getIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }

        return -1; // if not found
    }


    public static boolean insert(String firstname, String lastname, String phoneNumber) {
        if (isFull(contacts)) {
            return false;
        }

        if (getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;

        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);

        if(positionToUpdate == -1) {
            return false;
            // return new String[] {};
        }

//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        contacts[positionToUpdate][2] = newPhoneNumber;
        //return contact;
        return true;
    }

        public static String[] delete (String phoneNumber){
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) {
            return new String[] {};
        }

        System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);


        if (positionToDelete == contacts.length - 1) {
            pivot--;
        } else {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        return contact;
    }

    public static boolean isFull(String[][] arr) {
        return pivot == arr.length - 1;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) {
            return new String[] {};
        }

        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }








    public static boolean isFull(String[][] arr) {
        return pivot == arr.length - 1;
    }
    /*
     * Custom logger.
     * Varargs String[] message
     * log(Exception)
     */

    public static void log(Exception e, String... message) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true ))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}