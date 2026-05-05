import Menu.Menu;
import Serveces.BookService;
import Serveces.LibraryService;
import Serveces.MagazineService;
import Utils.MenuMessages;

import java.util.Scanner;

public class MainApp {

    static Menu menu = new Menu();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();
        BookService bookService = new BookService();
        MagazineService magazineService = new MagazineService();


        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            menu.displayMenu();
            Integer option = input.nextInt();

            switch (option) {
                case 1 -> {
                    Boolean LibraryMenuContinue = true;
                    while (LibraryMenuContinue) {
                        System.out.println(" *********** Library Menu ***********");
                        System.out.println(MenuMessages.Library_MENU_MESSAGE);
                        Integer libraryOption = input.nextInt();
                        LibraryMenuContinue = libraryService.handleLibraryMenu(libraryOption);
                    }
                }case 2 -> {
                    Boolean BookMenuContinue = true;
                    while (BookMenuContinue) {
                        System.out.println(" *********** Book Menu ***********");
                        System.out.println(MenuMessages.Book_MENU_MESSAGE);
                        Integer bookOption = input.nextInt();
                        BookMenuContinue = bookService.handleBookMenu(bookOption);
                    }
                }case 3 -> {
                    Boolean MagazineMenuContinue = true;
                    while (MagazineMenuContinue) {
                        System.out.println(" *********** Magazine Menu ***********");
                        System.out.println(MenuMessages.Magazine_MENU_MESSAGE);
                        Integer magazineOption = input.nextInt();
                        MagazineMenuContinue = magazineService.handleMagazineMenu(magazineOption);
                    }
                }
                case 5 -> {
                    System.out.println("Exit");
                    mainMenuContinue = false;
                }
                default -> System.out.println("Select a choice from the list");
            }


        }


    }
}
