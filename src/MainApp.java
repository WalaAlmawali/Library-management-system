import Menu.Menu;
import Serveces.BookService;
import Serveces.LibraryService;
import Serveces.MagazineService;
import Serveces.MemberService;
import Utils.MenuMessages;

import java.util.Scanner;

public class MainApp {

    static Menu menu = new Menu();
    static Scanner input = new Scanner(System.in);


    public static void showMenu() {

        Scanner sc = new Scanner(System.in);

        LibraryService libraryService = new LibraryService();
        BookService bookService = new BookService();
        MagazineService magazineService = new MagazineService();
        MemberService memberService = new MemberService();

        menu.displayMenu();


        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> {
                Boolean LibraryMenuContinue = true;
                while (LibraryMenuContinue) {
                    System.out.println(" *********** Library Menu ***********");
                    System.out.println(MenuMessages.Library_MENU_MESSAGE);
                    Integer libraryOption = input.nextInt();
                    LibraryMenuContinue = libraryService.handleLibraryMenu(libraryOption);
                    showMenu();
                }
            }case 2 -> {
                Boolean BookMenuContinue = true;
                while (BookMenuContinue) {
                    System.out.println(" *********** Book Menu ***********");
                    System.out.println(MenuMessages.Book_MENU_MESSAGE);
                    Integer bookOption = input.nextInt();
                    BookMenuContinue = bookService.handleBookMenu(bookOption);
                    showMenu();
                }
            }case 3 -> {
                Boolean MagazineMenuContinue = true;
                while (MagazineMenuContinue) {
                    System.out.println(" *********** Magazine Menu ***********");
                    System.out.println(MenuMessages.Magazine_MENU_MESSAGE);
                    Integer magazineOption = input.nextInt();
                    MagazineMenuContinue = magazineService.handleMagazineMenu(magazineOption);
                    showMenu();
                }
            }case 4 ->{
                Boolean MemberMenuContinue = true;
                while (MemberMenuContinue) {
                    System.out.println(" *********** Member Menu ***********");
                    System.out.println(MenuMessages.Member_MENU_MESSAGE);
                    Integer memberOption = input.nextInt();
                    MemberMenuContinue = memberService.handleMemberMenu(memberOption);
                    showMenu();
                }
            }
            case 5 -> {
                System.out.println("Exit");
             return;
            }
            default -> System.out.println("Select a choice from the list");
        }

    }



    public static void main(String[] args) {
         showMenu();

    }
}
