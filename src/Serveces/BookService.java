package Serveces;

import Entity.Book;
import Utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);

    public Book AddNewBook(){

        int idCount = 0;

        Book book = new Book();

        book.setId(idCount++);

        System.out.println("Enter Book Title");
        book.setTitle(scanner.nextLine());

        book.setStatus(false);

        return book;
    }

    public List<Book> AddNewBooks(){

        List<Book> bookList = new ArrayList<>();

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

    public void DisplayBook(int bookID){


    }


    public Boolean handleBookMenu(Integer bookOption) {

        Scanner scanner = new Scanner(System.in);

        switch (bookOption) {
            case 1 -> {
                System.out.println("Add new Book ");
                AddNewBooks();

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
