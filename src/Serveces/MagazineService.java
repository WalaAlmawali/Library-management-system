package Serveces;

import Entity.Book;
import Entity.Magazine;
import Utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagazineService {

    int idCount = 1;
    List<Magazine> magazineList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    public Magazine AddNewMagazine(){

       Magazine magazine = new Magazine();

        magazine.setId(idCount);
        idCount++;

        System.out.println("Enter Magazine Title");
        magazine.setTitle(scanner.nextLine());

        System.out.println("Enter Magazine Author");
        magazine.setAuthor(scanner.nextLine());

        System.out.println("Enter Magazine version");
        magazine.setVersion(scanner.nextLine());

        magazine.setStatus(false);

        return magazine;
    }

    public List<Magazine> AddNewMagazines(){

        Boolean continueFlag = true;
        while (continueFlag) {

            magazineList.add(AddNewMagazine());
            System.out.println(Constant.MAGAZINE_ADDED_SUCCESSFULLY);

            System.out.println(Constant.INPUT_EXIT_CONTINUE_MESSAGE_BOOK);
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return magazineList;

    }


    public Boolean handleMagazineMenu(Integer magazineOption) {

        Scanner scanner = new Scanner(System.in);

        switch (magazineOption) {
            case 1 -> {
                System.out.println("Add new Magazine ");

            }
            case 2 -> {
                System.out.println("Enter Magazine ID to show the Magazine details");


            }
            case 3 -> {
                System.out.println("Enter Magazine ID to delete the Magazine");


            }

            case 4 -> {
                System.out.println("Enter Magazine ID to update the Magazine");

            }
            case 5 -> {
                return false;
            }
        }
        return true;
    }
}
