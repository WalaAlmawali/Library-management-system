package Serveces;

import Entity.Book;
import Entity.Library;
import Entity.Magazine;
import Entity.Member;

import java.util.List;
import java.util.Scanner;


public class LibraryService {

    BookService bookService = new BookService();
    MagazineService magazineService = new MagazineService();
    MemberService memberService = new MemberService();

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

    public void DisplayBooks(){

        for(Book book : bookService.bookList ){
           bookService.DisplayBook(book.getId());
        }

    }

    public void DisplayMagazines(){

        for(Magazine magazine : magazineService.magazineList){
            magazineService.DisplayMagazine(magazine.getId());
        }

    }

    public void DisplayMembers(){

        for(Member member : memberService.memberList){
            memberService.DisplayMember(member.getId());
        }

    }

    public void FindBook(String str){
        for(Book book : bookService.bookList ){
           if(book.getTitle().contains(str)){

               bookService.DisplayBook(book.getId());
           }
        }

    }

    public void FindMagazine(String str){
        for(Magazine magazine : magazineService.magazineList ){
            if(magazine.getTitle().contains(str)){

                magazineService.DisplayMagazine(magazine.getId());
            }
        }

    }






    public Boolean handleLibraryMenu(Integer libraryOption) {

        Scanner scanner = new Scanner(System.in);

        switch (libraryOption) {
            case 1 -> {
                System.out.println("All Book in Library : ");
                DisplayBooks();

            }
            case 2 -> {
                System.out.println("All Magazine in Library :");
                DisplayMagazines();

            }
            case 3 -> {
                System.out.println(" All Members in Library :");
                DisplayMembers();
            }

            case 4 -> {
                System.out.println("Enter word that may in book title");
                FindBook(scanner.nextLine());

            }case 5 -> {
                System.out.println("Search For Magazine");
                FindMagazine(scanner.nextLine());

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
