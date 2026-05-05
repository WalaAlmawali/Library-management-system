package Serveces;


import Entity.Book;
import Entity.Member;
import Entity.MemberAddress;
import Utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {

    int idCount = 1;
    List<Member> memberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    BookService bookService = new BookService();

    public Member AddNewMember(){

        Member member = new Member();

        member.setId(idCount);
        idCount++;

        System.out.println("Enter Member name");
        member.setName(scanner.nextLine());

        System.out.println("Enter Member Address : ");

        System.out.println("Enter Street");
        String street = scanner.nextLine();

        System.out.println("Enter City");
        String city = scanner.nextLine();

        System.out.println("Enter Postal Code");
        String postalCode = scanner.nextLine();

        MemberAddress memberAddress = new MemberAddress(street,city,postalCode);
        member.setAddress(memberAddress);



        return member;
    }

    public List<Member> AddNewMembers(){

        Boolean continueFlag = true;
        while (continueFlag) {

            memberList.add(AddNewMember());
            System.out.println(Constant.Member_ADDED_SUCCESSFULLY);

            System.out.println(Constant.INPUT_EXIT_CONTINUE_MESSAGE_BOOK);
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return memberList;

    }

    public void DisplayMember(int memberID){

        if(memberList.isEmpty()){
            System.out.println(Constant.MEMBER_LIST_IS_EMPTY);
        }

        for(Member member : memberList){

            if(member.getId() == memberID){

                System.out.println("Member ID : " + member.getId());
                System.out.println("Member name : " + member.getName());
                System.out.println("Member address : " + member.getAddress().getFormattedAddress());

            }
        }

    }

    public void UpdateMember(int memberID){

        if(!memberList.isEmpty()){

            for(Member member: memberList){

                if(member.getId() == memberID){

                    System.out.println("Enter updated Member name");
                    member.setName(scanner.nextLine());

                    System.out.println("Enter updated Member Address : ");

                    System.out.println("Enter updated Street");
                    String street = scanner.nextLine();

                    System.out.println("Enter updated City");
                    String city = scanner.nextLine();

                    System.out.println("Enter updated Postal Code");
                    String postalCode = scanner.nextLine();

                    MemberAddress memberAddress = new MemberAddress(street,city,postalCode);
                    member.setAddress(memberAddress);

                    System.out.println(Constant.MEMBER_UPDATE_SUCCESSFULLY);
                }
            }

        }else {
            System.out.println(Constant.MEMBER_LIST_IS_EMPTY);
        }
    }

    public void DeleteMember(int memberID){

        if(!memberList.isEmpty()){

            memberList.removeIf(b -> b.getId() == memberID);
            System.out.println(Constant.MEMBER_DELETE_SUCCESSFULLY);

        }else {
            System.out.println(Constant.MEMBER_LIST_IS_EMPTY);
        }

    }

    public void BorrowingBook(int bookID){

        for(Book book : bookService.bookList){

            if(book.getId() == bookID ){
                book.setStatus(true);
            }

        }

    }




    public Boolean handleMemberMenu(Integer memberOption) {

        Scanner scanner = new Scanner(System.in);

        switch (memberOption) {
            case 1 -> {
                System.out.println("Add new Member ");
                AddNewMembers();

            }
            case 2 -> {
                System.out.println("Enter Member ID to show the Member information");
                DisplayMember(scanner.nextInt());


            }
            case 3 -> {
                System.out.println("Enter Member ID to delete the Member");
                DeleteMember(scanner.nextInt());

            }

            case 4 -> {
                System.out.println("Enter Member ID to update the Member");
                UpdateMember(scanner.nextInt());

            }case 5->{
                System.out.println("Enter Book ID to Borrowing it");
                BorrowingBook(scanner.nextInt());


            }case 6->{


            }
            case 7 -> {
                return false;
            }
        }
        return true;
    }


}
