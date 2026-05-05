package Serveces;

import Entity.Book;
import Utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {

    int idCount = 1;

    List<Book> bookList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Book AddNewBook(){

        Book book = new Book();

        book.setId(idCount);
        idCount++;

        System.out.println("Enter Book Title");
        book.setTitle(scanner.nextLine());

        System.out.println("Enter Book Author");
        book.setAuthor(scanner.nextLine());

        System.out.println("Enter Book version");
        book.setVersion(scanner.nextLine());

        book.setStatus(false);

        return book;
    }

    public List<Book> AddNewBooks(){


        Boolean continueFlag = true;
        while (continueFlag) {

            bookList.add(AddNewBook());
            System.out.println(Constant.BOOK_ADDED_SUCCESSFULLY);

            System.out.println(Constant.INPUT_EXIT_CONTINUE_MESSAGE_BOOK);
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return bookList;

    }

    public void DeleteBook(int bookID){

        if(!bookList.isEmpty()){

            bookList.removeIf(b -> b.getId() == bookID);
            System.out.println(Constant.BOOK_DELETE_SUCCESSFULLY);

        }else {
            System.out.println(Constant.BOOK_LIST_IS_EMPTY);
        }

    }

    public void UpdateBook(int bookID){


    }

    public void DisplayBook(int bookID){

        if(bookList.isEmpty()){
            System.out.println(Constant.BOOK_LIST_IS_EMPTY);
        }

        for(Book book : bookList){

            if(book.getId() == bookID){

                System.out.println("Book ID : " + book.getId());
                System.out.println("Book title : " + book.getTitle());
                System.out.println("Book statue : " + book.isStatus());
                System.out.println("Book author : " + book.getAuthor());
                System.out.println("Book version : " + book.getVersion());


            }
        }


    }


    public Boolean handleBookMenu(Integer bookOption) {

        Scanner scanner = new Scanner(System.in);

        switch (bookOption) {
            case 1 -> {
                System.out.println("Add new Book ");
                AddNewBooks();

            }
            case 2 -> {
                System.out.println("Enter Book ID to show the Book details");
                DisplayBook(scanner.nextInt());

            }
            case 3 -> {
                System.out.println("Enter Book ID to delete the Book");
                DeleteBook(scanner.nextInt());

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
