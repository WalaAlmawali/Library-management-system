package Serveces;

import Entity.Library;

import java.util.Scanner;


public class LibraryService {

    public static Library libraryInit() {

        Library library = new Library();
        library.setName("Al-Nebras Library");
        library.setAddress("Muscat");

        return library;
    }

    public void displayLibrary(){

        System.out.println("Library name : " + libraryInit().getName());
        System.out.println("Library address : " + libraryInit().getAddress());

    }




    public Boolean handleLibraryMenu(Integer libraryOption) {

        Scanner scanner = new Scanner(System.in);

        switch (libraryOption) {
            case 1 -> {
                System.out.println("All Book in Library : ");

            }
            case 2 -> {
                System.out.println("All Magazine in Library :");

            }
            case 3 -> {
                System.out.println(" All Members in Library :");
            }

            case 4 -> {
                System.out.println("Search For Book");

            }case 5 -> {
                System.out.println("Search For Magazine");

            }case 6->{
                System.out.println("Search For Member");

            }case 7 ->{
                System.out.println("Show Library Information");
                displayLibrary();

            }
            case 8 -> {
                return false;
            }
        }
        return true;
    }
}
