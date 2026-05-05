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

    public void DisplayMagazine(int magazineID){

        if(magazineList.isEmpty()){
            System.out.println(Constant.MAGAZINE_LIST_IS_EMPTY);
        }

        for(Magazine magazine : magazineList){

            if(magazine.getId() == magazineID){

                System.out.println("magazine ID : " + magazine.getId());
                System.out.println("magazine title : " + magazine.getTitle());
                System.out.println("magazine statue : " + magazine.isStatus());
                System.out.println("magazine author : " + magazine.getAuthor());
                System.out.println("magazine version : " + magazine.getVersion());

            }
        }


    }

    public void DeleteMagazine(int magazineID){

        if(!magazineList.isEmpty()){

            magazineList.removeIf(b -> b.getId() == magazineID);
            System.out.println(Constant.MAGAZINE_DELETE_SUCCESSFULLY);

        }else {
            System.out.println(Constant.MAGAZINE_LIST_IS_EMPTY);
        }

    }

    public void UpdateMagazine(int magazineID){

        if(!magazineList.isEmpty()){

            for(Magazine magazine: magazineList){

                if(magazine.getId() == magazineID){

                    System.out.println("Enter updated Magazine Title");
                    magazine.setTitle(scanner.nextLine());

                    System.out.println("Enter updated Magazine Author");
                    magazine.setAuthor(scanner.nextLine());

                    System.out.println("Enter updated Magazine version");
                    magazine.setVersion(scanner.nextLine());

                    System.out.println(Constant.BOOK_UPDATE_SUCCESSFULLY);
                }
            }

        }else {
            System.out.println(Constant.MAGAZINE_LIST_IS_EMPTY);
        }
    }


    public Boolean handleMagazineMenu(Integer magazineOption) {

        Scanner scanner = new Scanner(System.in);

        switch (magazineOption) {
            case 1 -> {
                System.out.println("Add new Magazine ");
                AddNewMagazines();

            }
            case 2 -> {
                System.out.println("Enter Magazine ID to show the Magazine details");
                DisplayMagazine(scanner.nextInt());

            }
            case 3 -> {
                System.out.println("Enter Magazine ID to delete the Magazine");
                DeleteMagazine(scanner.nextInt());

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
