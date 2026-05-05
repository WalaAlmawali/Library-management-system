package Serveces;

import java.util.Scanner;

public class BookService {


    public Boolean handleBookMenu(Integer bookOption) {

        Scanner scanner = new Scanner(System.in);

        switch (bookOption) {
            case 1 -> {
                System.out.println("Add new Book ");

            }
            case 2 -> {
                System.out.println("Show a Book");

            }
            case 3 -> {
                System.out.println("Delete a Book");

            }

            case 4 -> {
                System.out.println("Update a Book");

            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }


}
